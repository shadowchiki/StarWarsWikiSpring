package com.klonoadesign.starwarswiki.usecase.detail.service;

import org.springframework.stereotype.Service;

import com.klonoadesign.starwarswiki.common.model.Item;

@Service
public interface DetailService {

	Item getDetailById(String category, String id);
	
}
