package ConstructModel;

public abstract class MealBuilder {
	 Meal meal=new Meal();
	
	public abstract void buildFood();
	public abstract void buildDrink();
	public abstract Meal getMeal();

}
