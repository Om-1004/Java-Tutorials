import javax.sql.rowset.CachedRowSet;

public class Main {
	public static void main(String[] args) {

//		String classes[][] = new String[3][3];
		String[][] classes = {{"Functions","Chemistry","Computer_Science"},
				              {"Calculus", "English", "Biology"}, 
				              {"Computer Technology", "Advanced Functions", "Data Management"}};
//		classes[0][0] = "Functions";
//		classes[0][1] = "Chemistry";
//		classes[0][2] = "Computer Science";
//		
//		classes[1][0] = "Calculus";
//		classes[1][1] = "English";
//		classes[1][2] = "Biology";
//		
//		classes[2][0] = "Computer Technology";
//		classes[2][1] = "Advanced Functions";
//		classes[2][2] = "Data Management";
		
		for(int i=0; i<classes.length; i++) {
			System.out.println();
			for(int j=0; j<classes[i].length; j++) {
				System.out.print(classes[i][j] + "  ");
			}
		}
	}

}
