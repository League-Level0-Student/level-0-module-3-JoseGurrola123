
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
	
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
Robot  bender=new Robot();
bender.setX(200);
		// 2. Make the robot draw a star shape. Hint: 144.
bender.penDown();
bender.setSpeed(2000);
bender.turn(144);
bender.move(90);
bender.turn(144);
bender.move(90);
bender.turn(144);
bender.move(90);
bender.turn(144);
bender.move(90);
bender.turn(144);
bender.move(90);
bender.turn(144);
bender.move(90);
bender.turn(144);



//2. set the pen width to 10
bender.setPenWidth(10);
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
