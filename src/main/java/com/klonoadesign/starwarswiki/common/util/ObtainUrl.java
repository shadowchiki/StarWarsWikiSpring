package com.klonoadesign.starwarswiki.common.util;

public class ObtainUrl {

	private final String PAGE = "?page=";
	
	private StringBuilder baseUrl() {
		StringBuilder baseUrl = new StringBuilder("https://swapi.dev/api/");
		return baseUrl;
	}
	
	public String getCategory(String category, String pagination) {
		
		StringBuilder url = this.baseUrl().append(category).append("/");
		if(!pagination.isBlank())
			url.append(PAGE).append(pagination);
		
		return url.toString();
	}
	
	public String getDetail(String category, String id) {
		return this.baseUrl() + category + "/" + id + "/";
	}
	
}
