import java.util.*;
import javax.swing.*;


public class main {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("enter your name");
		JOptionPane.showMessageDialog(null ,"hello "+name);
		
		int age=Integer.parseInt(JOptionPane.showInputDialog("how old r u?"));
		JOptionPane.showMessageDialog(null, "u r "+age+" years old");
		
		double height=Double.parseDouble(JOptionPane.showInputDialog("how tall r u(cm)?"));
		JOptionPane.showMessageDialog(null, "u r "+height+" centimeters tall");
	}

}
