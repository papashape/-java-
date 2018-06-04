package AbstractFactory;

import AbstractFactory.AbstractMealFactory.mealBuilderFactory;
import AbstractFactory.Interface.drinkBuilder;
import AbstractFactory.Interface.foodBuilder;

public class MealFactory {
	public static class mealAFactory extends mealBuilderFactory{

		@Override
		public foodBuilder creatFood() {
			// TODO Auto-generated method stub
			return new foodA();
		}

		@Override
		public drinkBuilder creatDrink() {
			// TODO Auto-generated method stub
			return new drinkA();
		}
		
	}
	
	 static  class mealBFactory extends mealBuilderFactory{

		@Override
		public foodBuilder creatFood() {
			// TODO Auto-generated method stub
			return new foodB();
		}

		@Override
		public drinkBuilder creatDrink() {
			// TODO Auto-generated method stub
			return new drinkB();
		}
		
	}

}
