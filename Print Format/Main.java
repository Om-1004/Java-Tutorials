public class Main {
	public static void main(String[] args) {
		
		//System.out.printf("This %d string will be formatted ", 100);
		
		boolean myBoolean = true;
		char myChar = '!';
		String myString = "Om";
		int myInt = 17;
		double myDouble = -17.2;
		int bigNum = 15252334;
		
		//System.out.printf("%b", myBoolean);
		//System.out.printf("%c",myChar);
		//System.out.printf("%s", myString);
		//System.out.printf("%d", myInt);
		//System.out.printf("%f", myDouble);
		
		//System.out.printf("Hello %10s", myString);
		//System.out.printf("Your double value is %.2f", myDouble);
		//System.out.printf("Your double value is %+.2f", myDouble);
		System.out.printf("Your number is %,d", bigNum);
	}

}
