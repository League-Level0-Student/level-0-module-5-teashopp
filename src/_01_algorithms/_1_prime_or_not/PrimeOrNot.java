package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("Please input an integer:");

		int numint = Integer.parseInt(num);

		boolean flag = false;

		for (int i = 2; i <= numint / 2; i++) {

			if (numint % i == 0) {

				flag = true;

				break;

			}

		}

		if (!flag)

			JOptionPane.showMessageDialog(null, "That is a prime number");

		else {

			JOptionPane.showMessageDialog(null, "That is not a prime number");

		}

	}

}
