import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
static	Robot wally = new Robot();
public static void main(String[] args) {
	//1. Make a new class, create a main method, and show the robot.
	//drawSquare();
	//2. Have the robot draw a square
//drawTriangle();
	//3. Extract this code into a drawSquare() method.
//drawCircle();
	//4. Have the robot draw a triangle.

	//5. Extract this code into a drawTriangle() method.

	//6. Have the robot draw a circle.

	//7. Extract this code into a drawCircle() method.
	String ans2 = JOptionPane.showInputDialog("what color do you want");

	if (ans2.equals("red")) {
		wally.setPenColor(255, 0, 0);
	}
	else if (ans2.equals("green")) {
		wally.setPenColor(0, 255, 0);
	}
	else if (ans2.equals("blue")) {
		wally.setPenColor(0, 0, 255);
	}
	//8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.
String ans = JOptionPane.showInputDialog("What shape do you want?");

if (ans.equals("square") ) {
	drawSquare();
}
else if (ans.equals("circle")) {
	drawCircle();
}
else if (ans.equals("triangle")) {
	drawTriangle();
}
	//9. Ask the user which color they want. Color the the shape depending on their answer.

}

static void drawSquare() {
	wally.penDown();
	wally.setSpeed(50);
	wally.move(100);
	wally.turn(90);
	wally.move(100);
	wally.turn(90);
	wally.move(100);
	wally.turn(90);
	wally.move(100);
	wally.turn(90);
	
}

static void drawTriangle() {
	wally.penDown();
	wally.setSpeed(50);
	wally.turn(35);
	wally.move(100);
	wally.turn(100);
	wally.move(100);
	wally.turn(130);
	wally.move(150);
}

static void drawCircle() {
	for (int i = 0; i < 360; i++) {
		wally.penDown();
		wally.setSpeed(1000);
		wally.move(4);
		wally.turn(360/360);
	}
	
}
}