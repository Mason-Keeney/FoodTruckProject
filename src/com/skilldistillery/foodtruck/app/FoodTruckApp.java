package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private boolean isInputting = true;
	private boolean menuShowing = true;
	
	public static void main(String[] args) {

		
//	USER INPUT LOOP VARIABLES
		Scanner sc = new Scanner(System.in);
		FoodTruck[] trucks = new FoodTruck[5];
		FoodTruckApp app = new FoodTruckApp();

		
//	USER INPUT FOR LOOP BEGIN
		for (int i = 0; i < 5; i++) {
			if(app.isInputting == true) {
			trucks[i] = app.rateNewTruck(sc, app);
			} else {
				break;
			}
		}
		
		
//	MENU LOOP VARIABLES
		
		while(app.menuShowing) {
			app.printMenu();
			int input = sc.nextInt();
			app.menuSwitch(input, trucks, app);
		}
			
		if(app.menuShowing) {
			sc.close();
		}
	

	}

//  CREATES FOODTRUCK BASED ON USER INPUT RETURNS TO USER	
	private FoodTruck rateNewTruck(Scanner sc, FoodTruckApp app) {
		
		System.out.print("Please enter the name of the Food Truck you would like to rate (enter quit to exit): ");
		FoodTruck temp = new FoodTruck();
		String name = sc.nextLine();
			if (name.toLowerCase().equals("quit")) {
				isInputting = false;
				return null;
			}
		temp.setName(name);
		System.out.print("Please enter the type of food that " + name +  " serves: ");
		String food = sc.nextLine();
		temp.setFoodType(food);
		System.out.println("Now, how would you rate them?");
		int rating = sc.nextInt();
		sc.nextLine();
		temp.setRating(rating);
		
		
		return temp;
		
	}
	
//	PRINTS MENU
	private void printMenu() {
		System.out.println("---------------------------------------------");
		System.out.println("|                                           |");
		System.out.println("|          Please Select a number           |");
		System.out.println("|                                           |");
		System.out.println("| 1. List all Existing food trucks          |");
		System.out.println("| 2. See the average rating of food trucks  |");
		System.out.println("| 3. Display the highest-rated food truck   |");
		System.out.println("| 4. Quit the program                       |");
		System.out.println("|                                           |");
		System.out.println("---------------------------------------------");
	}
	
//	ALLOWS USER TO INTERACT WITH MENU
	private void menuSwitch(int choice, FoodTruck[] trucks, FoodTruckApp app) {
		switch (choice) {
		case 1:
			for (FoodTruck truck : trucks) {
				if (truck != null) {
				System.out.println(truck.toString());
				}
			}
			break;
		case 2:
			System.out.println(app.averageRating(trucks));
			break;
		case 3:
			FoodTruck best = app.highestRating(trucks);
			System.out.println("The best truck is " + best.getName() + "  at a rating of: " + best.getRating());
			break;
		case 4:
			menuShowing = false;
			return;
			
		}
	}
	
//	FILTERS TO HIGHEST RATED FOODTRUCK
	private FoodTruck highestRating(FoodTruck[] trucks) {
		FoodTruck best = trucks[0];
		for (FoodTruck truck : trucks) {
			if (truck != null) {
				if (truck.getRating() > best.getRating()) {
					best = truck;
				}
			}
		}
		return best;
		
	}
	
// AVERAGES RATING OF FOODTRUCKS
	private int averageRating(FoodTruck[] trucks) {
		int average = 0;
		int numTruck = 0;
		for (FoodTruck truck : trucks) {
			if (truck != null) {
				average += truck.getRating();
				numTruck++;
			} else {
				break;
			}
		}
		average /= numTruck;
		
		return average;
	}
}
