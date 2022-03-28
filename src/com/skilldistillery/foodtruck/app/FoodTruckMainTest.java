package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckMainTest {

	public static void main(String[] args) {

//		THIS FILE ONLY EXISTS TO TEST IF FOODTRUCKAPP WOULD WORK IN A SEPARATE MAIN IF INSTANTIATED
//		AND IT DOES, FEEL FREE TO IGNORE IT
		
			Scanner sc = new Scanner(System.in);
			FoodTruck[] trucks = new FoodTruck[5];
			FoodTruckApp app = new FoodTruckApp();

			app.run(sc, trucks, app);

			sc.close();

		}

}
