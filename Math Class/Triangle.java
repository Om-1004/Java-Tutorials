import javax.swing.JOptionPane;

public class Triangle {

	public static void main(String[] args) {

		cValue();
		
	}
	public static void cValue() {
		int power = 2;
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the a value"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the b value"));
		double c = Math.sqrt(Math.pow(a, power) + (Math.pow(b, 2)));
		JOptionPane.showMessageDialog(null, "c value is " + c);
	}
	}
	
