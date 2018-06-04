package ConstructModel;

public class SubMealBuilderA extends MealBuilder {

	@Override
	public void buildFood() {
		// TODO Auto-generated method stub

		System.out.println("提供A食物");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		System.out.println("提供A饮料");

	}

	@Override
	public Meal getMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

}
