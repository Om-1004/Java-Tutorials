
public class Main {

	public static void main(String[] args) {
		
		//Object = an instance of a class that may contain attributes and methods
		
		Ball myBall = new Ball();
		System.out.println(myBall.size);
		System.out.println(myBall.colour);
		System.out.println(myBall.price);
		System.out.println(myBall.cheap);
		
		myBall.bounce();
		myBall.kick();
		
		
		
	}

}
