package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();

		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();

	}

	void skill1() {

		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimesint = Integer.parseInt(dimes);
		dimesint *= 10;

		String height = JOptionPane.showInputDialog("How tall are you? (in inches)");
		int heightint = Integer.parseInt(height);

		if (heightint <= 36) {
			JOptionPane.showMessageDialog(null, "Eat your wheaties!");
		}

		else {
			JOptionPane.showMessageDialog(null, "Oh, nice.");
		}

	}

	void skill2() {

		for (int i = 1; i < 31; i++) {

			if (i % 3 == 0) {
				System.out.println(i);
			}

		}
	}

	void skill3() {

		Random randint = new Random();
		int randNum = randint.nextInt(20 - 1 + 1) + 1;

		Random randint2 = new Random();
		int randNum2 = randint2.nextInt(10 - 1 + 1) + 1;

		int newNum = randNum -= randNum2;
		JOptionPane.showMessageDialog(null, newNum);

	}

	void skill4() {

		String home = JOptionPane.showInputDialog("Which city do you live in?");

		if (home.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "Good for you, that's America's finest city!");
		}

		else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego!");
		}

		String cars = JOptionPane.showInputDialog(null, "How many cars does your family have?");
		int carsint = Integer.parseInt(cars);

		if (carsint == 1) {
			JOptionPane.showMessageDialog(null, "I hope it's a 2001 Pruis.");
		}

		else {
			int wheelsint = carsint * 4;
			JOptionPane.showMessageDialog(null, "There are " + wheelsint + " wheels in your family.");
		}

	}

	void skill5() {

		String school = JOptionPane.showInputDialog("What school do you go to?");
		JOptionPane.showMessageDialog(null, "Wow, " + school + "? That's a great school!");
		
	}

}
