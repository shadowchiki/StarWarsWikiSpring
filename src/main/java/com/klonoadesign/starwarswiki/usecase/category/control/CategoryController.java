package com.klonoadesign.starwarswiki.usecase.category.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.klonoadesign.starwarswiki.common.model.Items;
import com.klonoadesign.starwarswiki.usecase.category.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@GetMapping("/{category}")
	public String getCategory(@PathVariable("category") String category,
			@RequestParam(name = "pagination", required = false, defaultValue = "1") String pagination,
			Model model) {
		
		Items items = service.getCategoryInfo(category, pagination);
		
		model.addAttribute("count", items.getNext());
		model.addAttribute("previous", items.getPrevious());
		model.addAttribute("next", items.getNext());
		model.addAttribute("results", items.getResults());
		
		return "category/" + category;
		
	}
	
}
