public class Main {

	public static void main(String[] args) {
		
		String name = "       Om      ";
		
		//boolean answer = name.equals("Om");
		//boolean answer = name.equalsIgnoreCase("oM");
		//boolean answer = name.length();
		//char answer = name.charAt(0);
		//int answer = name.indexOf("m");
		//boolean answer = name.isEmpty();
		//String answer = name.toUpperCase();
		//String answer = name.toLowerCase();
		//String name = name.trim();
		String answer = name.replace('O', 'N');
		
		System.out.println(answer);
	}

}
