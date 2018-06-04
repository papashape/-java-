package ConstructModel;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MealBuilder mealBuilder=new SubMealBuilderA();
		KFCWaiter kfcWaiter=new KFCWaiter();
		kfcWaiter.setMealBuilder(mealBuilder);
		kfcWaiter.construct();
	}

}
