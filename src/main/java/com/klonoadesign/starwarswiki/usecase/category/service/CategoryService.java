package com.klonoadesign.starwarswiki.usecase.category.service;

import com.klonoadesign.starwarswiki.common.model.Items;

public interface CategoryService {
	
	Items getCategoryInfo(String category, String pagination);

}
