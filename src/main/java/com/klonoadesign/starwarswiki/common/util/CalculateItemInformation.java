package com.klonoadesign.starwarswiki.common.util;

import com.klonoadesign.starwarswiki.common.model.Item;

public class CalculateItemInformation {

	private Item item;
	
	public CalculateItemInformation(Item item) {
		this.item = item;
	}
	
	public void image(String category) {
		item.setImage("../assets/"+ category +"/"+category+"_" + item.getUrl() + ".webp");		
	}
	
	public void id() {
		item.setUrl(item.getUrl().split("/")[5]);
	}
	
}
