package com.klonoadesign.starwarswiki.common.util;

public class ObtainUrl {

	private String baseUrl() {
		return "https://swapi.dev/api/";
	}
	
	public String getCategory(String category) {
		return this.baseUrl() + category + "/";
	}
	
	public String getDetail(String category, String id) {
		return this.baseUrl() + category + "/" + id + "/";
	}
	
}
