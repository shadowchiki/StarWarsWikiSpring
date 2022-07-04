package com.klonoadesign.starwarswiki.common.model;

import java.util.List;

import org.springframework.ui.Model;

public class Items {

	private int count;
	private String next;
	private String previous;
	private List<Item> results;
	
	public Model addAttributes(Model model) {
		
		model.addAttribute("count", this.getCount());
		model.addAttribute("previus", this.getPrevious());
		model.addAttribute("next", this.getNext());
		model.addAttribute("results", this.getResults());
		
		return model;
	}
	
	public List<Item> getResults() {
		return results;
	}

	public void setResults(List<Item> results) {
		this.results = results;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previus) {
		this.previous = previus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Items [count=");
		builder.append(count);
		builder.append(", next=");
		builder.append(next);
		builder.append(", previous=");
		builder.append(previous);
		builder.append(", results=");
		builder.append(results);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
