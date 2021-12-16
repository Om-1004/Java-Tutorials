public class Subway {
	
	String bread;
	String sauce;
	String topping;
	String topping2;
	double price;
	
	Subway(String bread, String sauce, String topping, String topping2, double price){
		this.bread = bread;
		this.sauce = sauce;
		this.topping = topping;
		this.topping2 = topping2;
		this.price = price;
	}

	Subway(String bread, String sauce, String topping, double price){
		this.bread = bread;
		this.sauce = sauce;
		this.topping = topping;
		this.price = price;
	}
	
	Subway(String bread, String sauce, double price){
		this.bread = bread;
		this.sauce = sauce;
		this.price = price;
	}

}
