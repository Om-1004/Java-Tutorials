import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//String[] classes = {"Functions", "Biology", "Chemistry"};
		ArrayList<String> classes = new ArrayList<String>();
		
		classes.add("Functions");
		classes.add("Biology");
		classes.add("Chemistry");
		
		for(String i : classes) { // : means in
			 System.out.println(i);
		}
	}

}
