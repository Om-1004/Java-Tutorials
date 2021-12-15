
public class Main {

	public static void main(String[] args) {

		double x = add(1.2, 4.3, 7.4);
	}

	static int add(int a, int b) {
		System.out.println("Overloaded Method Number 1");
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("Overloaded Method Number 2");
		return a+b+c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("Overloaded Method Number 3");
		return a+b+c+d;
	}
	
	static double add(double a, double b) {
		System.out.println("Overloaded Method Number 4");
		return a+b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("Overloaded Method Number 5");
		return a+b+c;
	}
	

}
