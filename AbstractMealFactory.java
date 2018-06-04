package AbstractFactory;

import AbstractFactory.Interface.drinkBuilder;
import AbstractFactory.Interface.foodBuilder;

public class AbstractMealFactory {
	public static abstract class mealBuilderFactory{
		 abstract foodBuilder creatFood();
		 abstract drinkBuilder creatDrink();
	}

}
