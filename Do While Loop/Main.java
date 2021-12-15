import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		do {
			System.out.println("Enter your name: ");
			name = sc.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello " + name + "!");

	}

}
