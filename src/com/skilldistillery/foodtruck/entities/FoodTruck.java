package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int idShift;
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
	
//	USES IDSHIFT TO RANDOMIZE A 12 PLACE NUMERIC ID
	private String setId() {
		String newId = "";
		StringBuilder sb = new StringBuilder();
		sb.append(((idShift + 1) % 10) + "-");
		

		for (int i = 1; i < 10; i++) {
			int random = (int)Math.round(Math.random() * (idShift + 3));
				sb.append(((random * (i + idShift)) % 10));	
				if (i % 3 == 0 && i != 9) {
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
