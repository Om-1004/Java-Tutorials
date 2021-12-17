public class Dog {
	
	String name;
	static int numberofDogs;
	
	Dog(String name){
		this.name = name;
		numberofDogs++;
	}
	
	static void displayDogs() {
		System.out.println("You have " + numberofDogs + " dogs");
	}

}
