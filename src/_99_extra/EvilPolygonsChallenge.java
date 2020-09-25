package _99_extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot rob = new Robot();

		// 2. Set the speed to 100
		rob.setSpeed(100);

		int colorChoice = JOptionPane.showOptionDialog(null, "Choose a color:", null, JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Red", "Blue", "Yellow" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 0) {
			rob.setPenColor(255, 0, 0);
		}

		else if (colorChoice == 1) {
			rob.setPenColor(0, 0, 255);
		}

		else if (colorChoice == 2) {
			rob.setPenColor(255, 255, 0);
		}

		// 4. Ask the use how many polygons they want to be drawn.

		String polygons = JOptionPane.showInputDialog("How many polygons would you like drawn?");
		int polygonsValue = Integer.parseInt(polygons);

		// 5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < polygonsValue; i++) {

			rob.penDown();
			
			for (int j = 0; j < 4; j++) {
				rob.move(50);
				rob.turn(90);
			}

			rob.penUp();
			rob.move(90);

		}

		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}
