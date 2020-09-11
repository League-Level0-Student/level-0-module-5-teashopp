package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line:
	static int happinessLevel = 0;
	static String pet = "";

	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		pet = JOptionPane.showInputDialog("What type of pet would you like?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int i = 0; i < 100; i++) {

			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your " + pet + "?", "Action",
					0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cuddle", "Give Food", "Groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				cuddle();
			}

			if (task == 1) {
				givefood();
			}

			if (task == 2) {
				groom();
			}

			if (happinessLevel >= 10) {
				JOptionPane.showMessageDialog(null, "You've achieved maximum happiness with your " + pet + "!");
				break;
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
		}
	}


	// 4. Create methods to handle each of your user selections.
	static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " is happy.");
		happinessLevel += 5;
	}

	static void givefood() {
		JOptionPane.showMessageDialog(null, "Your " + pet + "is fed.");
		happinessLevel += 3;
	}

	static void groom() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " is beautiful.");
		happinessLevel -= 1;
	}

	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}