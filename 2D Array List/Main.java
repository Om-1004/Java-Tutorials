import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

		ArrayList<String> dairy = new ArrayList();
		dairy.add("milk");
		dairy.add("yougurt");
		dairy.add("cheeze");
		
		ArrayList<String> junkFood = new ArrayList();
		junkFood.add("Chips");
		junkFood.add("Bread");
		junkFood.add("Cookies");
		
		ArrayList<String> vegetable = new ArrayList();
		vegetable.add("Broccoli");
		vegetable.add("Cabbage");
		vegetable.add("Asparagus");
		
		groceryList.add(dairy);
		groceryList.add(junkFood);
		groceryList.add(vegetable);

		System.out.println(groceryList.get(1).get(2));
		
//		System.out.println(grocery.get(0));
	}

}
