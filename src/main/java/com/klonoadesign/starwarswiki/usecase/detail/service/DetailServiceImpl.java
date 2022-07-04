package com.klonoadesign.starwarswiki.usecase.detail.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klonoadesign.starwarswiki.common.model.Item;
import com.klonoadesign.starwarswiki.common.util.CalculateItemInformation;
import com.klonoadesign.starwarswiki.common.util.ObtainUrl;

@Service
public class DetailServiceImpl implements DetailService{

	@Override
	public Item getDetailById(String category, String id) {
		
		ObtainUrl obtainUrl = new ObtainUrl();
		
		ResponseEntity<Item> response = new RestTemplate().getForEntity(obtainUrl.getDetail(category, id), Item.class);
		
		CalculateItemInformation itemInformation = new CalculateItemInformation(response.getBody());
		itemInformation.id();
		itemInformation.image(category);
		
		return response.getBody();
	}

}
