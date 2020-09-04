package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {

			System.out.println(i);

		}

		System.out.println("--END STRING 1--");

		for (int i = 100; i >= 0; i--) {

			System.out.println(i);

		}

		System.out.println("--END STRING 2--");

		for (int i = 2; i < 101; i++) {

			if (i % 2 == 0) {

				System.out.println(i);

			}

		}

		System.out.println("--END OF STRING 2--");

		for (int j = 0; j < 101; j++) {

			if (j % 2 == 1) {

				System.out.println(j);

			}

		}

		System.out.println("--END OF STRING 3--");

		for (int k = 0; k < 501; k++) {

			if (k % 2 == 0) {

				System.out.println(k + " is even");

			}

			if (k % 2 == 1) {

				System.out.println(k + " is odd");

			}

		}

		System.out.println("--END OF STRING 4--");

		for (int i = 0; i < 778; i++) {

			if (i % 7 == 0) {

				System.out.println(i);

			}

		}

		System.out.println("--END OF STRING 5--");
		int yr = 2005;

		for (int i = 0; i < 16; i++) {

			if (i < 15) {

				System.out.println("In " + yr + ", I was " + i);

			}

			else {

				System.out.println("In " + yr + ", I am " + i);

			}

			int yr2 = yr + 1;

			yr = yr2;

		}

	}

}
