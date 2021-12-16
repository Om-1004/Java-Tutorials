public class Book {
	
	String colour = "Green";
	String genre = "Horror";
	double ratings = 4.5;
	double price = 6.99;
	/*
     	Book(String colour, String genre, double ratings, double price){
		this.colour = colour;
		this.genre = genre;
		this.ratings = ratings;
		this.price = price;
	}
	*/
	
	public String toString() {
		return colour + "\n" + genre + "\n" + ratings + "\n" + price;
	}

}
