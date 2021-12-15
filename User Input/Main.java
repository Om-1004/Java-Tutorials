import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		sc.nextLine(); // Clears Scanner
		
		System.out.println("Please enter your gender: ");
		String gender = sc.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("Your age is: " + age);
		System.out.println("Your gender is " + gender);
	}
}
