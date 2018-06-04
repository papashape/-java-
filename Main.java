package AbstractFactory;

import AbstractFactory.MealFactory.mealAFactory;
import AbstractFactory.MealFactory.mealBFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mealAFactory mAFactory=new mealAFactory();
		mAFactory.creatDrink();
		mAFactory.creatFood();
		
		mealBFactory mBFactory=new mealBFactory();
		mBFactory.creatDrink();
		mBFactory.creatFood();
		
	}

}
