import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> classes = new ArrayList<String>();
		
		classes.add("Functions");
		classes.add("Chemistry");
		classes.add("Physics");
		
		classes.remove("Chemistry");
		classes.set(1, "Biology");
		classes.clear();

		for (int i=0; i<classes.size(); i++) { // Array = class.length  || ArrayList = class.size();
			System.out.println(classes.get(i));
		}
	}

}
