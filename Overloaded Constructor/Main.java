import javax.naming.BinaryRefAddr;

public class Main {

	public static void main(String[] args) {
		
		Subway subway = new Subway("Italian Herb & Cheese", "Tomato", "Pickles", 5.30);
	
		System.out.println("Ingredients\n");
		System.out.println(subway.bread);
		System.out.println(subway.sauce);
		System.out.println(subway.topping);
		//System.out.println(subway.topping2);
		System.out.println(subway.price);

	}

}
