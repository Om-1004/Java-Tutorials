public class Main {
	public static void main(String[] args) {
		/*
		Food[] bag = new Food[3];

		
		bag[0] = food1;
		bag[1] = food2;
		bag[1] = food3;
		*/
		
		
		Food food1 = new Food("Tuna");
		Food food2 = new Food("Chocolate");
		Food food3 = new Food("Yogurt");
		
		Food[] bag = {food1, food2, food3};
		
		System.out.println(bag[0].name);
		System.out.println(bag[1].name);
		System.out.println(bag[2].name);

	}

}
