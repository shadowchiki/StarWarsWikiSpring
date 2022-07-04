package com.klonoadesign.starwarswiki.usecase.category.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klonoadesign.starwarswiki.common.model.Item;
import com.klonoadesign.starwarswiki.common.model.Items;
import com.klonoadesign.starwarswiki.common.util.CalculateItemInformation;
import com.klonoadesign.starwarswiki.common.util.ObtainUrl;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Override
	public Items getCategoryInfo(String category, String pagination) {
		
		ObtainUrl obtainUrl = new ObtainUrl();
				
		ResponseEntity<Items> response = new RestTemplate().getForEntity(obtainUrl.getCategory(category, pagination), Items.class);
		
		Items items = response.getBody();
		
		CalculateItemInformation calculateItemInformation;
		
		for(Item item : items.getResults()) {
			
			calculateItemInformation = new CalculateItemInformation(item);
			calculateItemInformation.id();
			calculateItemInformation.image(category);
			
		}
		
		items.setPrevious(calculatePagination(items.getPrevious()));
		items.setNext(calculatePagination(items.getNext()));
		
		return items;
	}
	
	private String calculatePagination(String pagination) {
		return pagination != null ? pagination.split("=")[1] : "1";
	}

}
