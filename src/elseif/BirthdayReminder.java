
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "April ";
		String dadsBirthday = "May 3";
		String myBirthday = "December 10th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday= JOptionPane.showInputDialog(null, "who's birthday do you want");
		// 3. Print out what the user typed
		if(bday.equals("Jose")) {
			JOptionPane.showMessageDialog(null, "December 10th");
		}
		// 4. if user asked for "mom"
		if(bday.equals("Mom")) {
			JOptionPane.showMessageDialog(null, "April");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
