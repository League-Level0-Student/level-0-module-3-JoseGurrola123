import java.util.Random;

import javax.swing.JOptionPane;

public class DragonFighter {
public static void main(String[] args) {
	int dragonLife=20;
	
	
	String ans=	JOptionPane.showInputDialog("Do you want to kick, punch, or throw a rock");
	Random gen = new Random();
	int damage= gen.nextInt();
if (ans.equals("kick")) {
	damage=gen.nextInt(10);
}
else if (ans.equals("punch")) {
	damage=gen.nextInt(7);
}
else if (ans.equals("throw a rock")) {
	damage=gen.nextInt(30);
}

dragonLife=dragonLife-damage;

if (dragonLife == 0) {
	JOptionPane.showMessageDialog(null, "YOU WIN!!");
}
else if (dragonLife > 0) {
	JOptionPane.showMessageDialog(null, "The dragon didn't die and now he killed you, you lose.");
}
	
}
}
