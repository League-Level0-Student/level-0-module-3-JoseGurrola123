package extras;

import javax.swing.JOptionPane;

public class Thanksgiving {
public static void main(String[] args) {
	String ans = JOptionPane.showInputDialog("Whats one thing you are thankful for?");
	String ans2 = JOptionPane.showInputDialog("Whats another thing you are thankful for?");
	String ans3 = JOptionPane.showInputDialog("Whats a third thing you are thankful for?");
	JOptionPane.showMessageDialog(null, "Remember to be thankful for : \n"+ans+"\n"+ans2+"\n"+ans3+"\n");
}
}
