
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		
		Robot bender=new Robot();
		for (int i = 0; i <10 ; i++) {
			
		
		//3. ask the user what color they would like the robot to draw
	String color=JOptionPane.showInputDialog("What color do you want?");
		//4. use an if/else statement to set the pen color that the user requested
if (color.equals("red")) {
	bender.setPenColor(255,0,0);
}
else if (color.equals("blue")) {
	bender.setPenColor(0,0,204);
}
else if (color.equals("green")) {
	bender.setPenColor(0,255,0);
}
        //5. if the user doesn’t enter anything, choose a random color
else if (color.equals("")) {
	bender.setRandomPenColor();
}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them


//2. set the pen width to 10
bender.setPenWidth(10);
//1. make the robot draw a shape (this will take more than one line of code)
		bender.setSpeed(20);
		bender.penDown();
		bender.move(200);
		bender.turn(90);
		bender.move(200);
		bender.turn(90);
		bender.move(200);
		bender.turn(90);
		bender.move(200);
		
		


	}
}
}