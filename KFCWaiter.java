package ConstructModel;


public class KFCWaiter {
	MealBuilder mealBuilder=null;
	
	public void setMealBuilder(MealBuilder mealBuilder) {
		this.mealBuilder=mealBuilder;
	}
	
	public Meal construct() {
		this.mealBuilder.buildFood();
		this.mealBuilder.buildDrink();
	    return mealBuilder.getMeal();
	}
	

}
