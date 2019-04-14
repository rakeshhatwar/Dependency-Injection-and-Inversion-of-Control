package com.wipro.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.model.Country;
import com.wipro.model.Player;

public class MainAppPlayerCountries {

	public static void main(String[] args) {
		
		final String COUNTRY_INDIA = "INDIA";
		final String COUNTRY_AUSTRALIA = "AUSTRALIA";
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
		
		//Player Details
		Player player1 = context.getBean("player", Player.class);
		Player player2 = context.getBean("player", Player.class);
		
		Player player3 = context.getBean("player", Player.class);
		Player player4 = context.getBean("player", Player.class);
		Player player5 = context.getBean("player", Player.class);
		
		//Country Details
		Country country1 = context.getBean("country", Country.class);
		Country country2 = context.getBean("country", Country.class);
		

		//Country Names for 1st Player
		country1.setCountryId("1");
		country1.setCountryName(COUNTRY_INDIA);
		
		//Player1 and 2 belongs to one country
		player1.setPlayerId("1");
		player1.setPlayerName("sachin");
		player1.setCountry(country1);
		
		
		//Player 2 Details
		player2.setPlayerId("2");
		player2.setPlayerName("Dravid");
		player2.setCountry(country1);
		
		
		//Other Country Details
		country2.setCountryId("2");
		country2.setCountryName(COUNTRY_AUSTRALIA);
		
		//Player3 belongs to other country
		player3.setPlayerId("3");
		player3.setPlayerName("Ricky");
		player3.setCountry(country2);
		
		player4.setPlayerId("4");
		player4.setPlayerName("Shane");
		player4.setCountry(country2);
		
		player5.setPlayerId("5");
		player5.setPlayerName("Michel");
		player5.setCountry(country2);
		
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(player4);
		System.out.println(player5);
		
		
		
		List<Player> indianPlayers =new ArrayList<>();
		indianPlayers.add(player1);
		indianPlayers.add(player2);
		
		List<Player> australiaPlayers =new ArrayList<>();
		australiaPlayers.add(player3);
		australiaPlayers.add(player4);
		australiaPlayers.add(player5);
		
		Map<String, List<Player>> playerDetails = new HashMap<>();		
		playerDetails.put(COUNTRY_INDIA, indianPlayers);
		playerDetails.put(COUNTRY_AUSTRALIA, australiaPlayers);
		
		System.out.println("\n Available countrys :\n ");
		System.out.print("1. "+COUNTRY_INDIA+ "  2. "+COUNTRY_AUSTRALIA);
		
		Scanner scanner = new Scanner(System.in);
		boolean exit = true;
				
		do {
			
			System.out.println("\n Please enter country name or enter 'exit' to terminate the program");
			
			String country = scanner.nextLine();
			country=country.toUpperCase();
			
			
			if(country.equalsIgnoreCase("exit")) {

				exit = false;
				
			} else if(playerDetails.containsKey(country)) {
				
				List<Player> players = playerDetails.get(country);
				
				players.forEach((player) -> {
					
					System.out.println(player);
					System.out.println("------------------------------");
				});
				
			} else {
				System.out.println(" Players Not Available");
			}
			
		}while(exit);
		
		scanner.close();
	}
}
