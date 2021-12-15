public class Main {

	public static void main(String[] args) {
		
		//Constructors = A special method that is called when an object is called

		Human human = new Human("Om", 17, "Male"); 
		Human human2 = new Human("Tom", 25, "Male"); 

		System.out.println(human.name);
		human.sleep();
		human2.eat();
	}

}
