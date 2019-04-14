package com.wipro.model;

public class Country {

	private String countryId;
	private String countryName;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(" countryId : ").append(getCountryId());
		sb.append("\n countryName : ").append(getCountryName());
		
		return sb.toString();
	}
	
	
}
