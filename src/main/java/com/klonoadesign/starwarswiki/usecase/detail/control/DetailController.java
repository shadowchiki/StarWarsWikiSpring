package com.klonoadesign.starwarswiki.usecase.detail.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.klonoadesign.starwarswiki.common.model.Item;
import com.klonoadesign.starwarswiki.usecase.detail.service.DetailService;

@Controller
public class DetailController {

	@Autowired
	private DetailService service;
	
	@GetMapping("/detail/{category}/{id}")
	public String getDetail(@PathVariable("category") String category,
			@PathVariable("id") String id,
			Model model) {
		
		Item item = service.getDetailById(category, id);
		
		model.addAttribute("item", item);
		
		return "detail/" + category;
	}
	
}
