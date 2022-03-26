package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckMainTest {

	public static void main(String[] args) {

//		REQUIRED MAIN VARIABLES
			Scanner sc = new Scanner(System.in);
			FoodTruck[] trucks = new FoodTruck[5];
			FoodTruckApp app = new FoodTruckApp();

			app.run(sc, trucks, app);

			sc.close();

		}

}
