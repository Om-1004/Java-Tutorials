public class Human{
	
	static String name;
	int age;
	String gender;
	
	Human(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
	
	void sleep() {
		System.out.println(this.name + " is sleeping");
	}

}
