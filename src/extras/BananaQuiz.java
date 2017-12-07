//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String ans=	JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
		if (ans.equals("no")) {
			JOptionPane.showMessageDialog(null, "You're crazy");
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		else if (ans.equals("yes")) {
		String hobby=	JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null,hobby+" is much better with bananas" );
		}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		//	show a pop up that says â€œYou are bananas!â€�
		else{
			JOptionPane.showMessageDialog(null, "You are bananas");
		}
	}

}
