package loops;

import javax.swing.JOptionPane;

public class AgeGame {
public static void main(String[] args) {
String age=JOptionPane.showInputDialog("How old are you?");
int num=Integer.parseInt(age);
if (num>29) {
	JOptionPane.showConfirmDialog(null, "You're too old");
}
else if (num<30) {
	
	
	JOptionPane.showConfirmDialog(null, "You were born in "+ (2017-num));
}




}
}
