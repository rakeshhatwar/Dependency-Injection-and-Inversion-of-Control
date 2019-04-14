package com.wipro.model;

public class Player {

	private String playerId;
	private String playerName;
	private Country country;

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(" playerId : ").append(getPlayerId());
		sb.append("\n playerName : ").append(getPlayerName());
		sb.append("\n Country : ").append(getCountry());
		
		return sb.toString();
	}
	
	
}
