package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int idShift = 1;
	private final String Id = setId();
	private String name;
	private String foodType;
	private int rating;

	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.rating = rating;
		this.foodType = foodType;
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	private String setId() {
		String newId = "";
		StringBuilder sb = new StringBuilder();
		
//	RANDOMIZES A TEN PLACE NUMERIC ID
		for (int i = 0; i < 12; i++) {
			int random = (int)Math.round(Math.random() * 6);
				sb.append(((random * (i + idShift)) % 10));	
				if (i % 3 == 0) {
					sb.append('-');
				}
		}
		
//	INCREMENT IDSHIFT	
		idShift++;
		
//	BUILD NEWID WITH STRINGBUILDER
		newId = sb.toString();
		return newId;
	}
	
	public String getId() {
		return Id;
	}
	
	@Override
	public String toString() {
		return "FoodTruck [ID: " + Id + " || Name: " + name + " || Serves: " + foodType + " || Rating: " + rating + "]";
	}
	
}
