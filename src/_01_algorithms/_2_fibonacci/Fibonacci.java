package _01_algorithms._2_fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		
		for (int i = 0; i < 10; i++) {
			
			int num3 = num1 + num2;
			System.out.println(num3);
			
			num1 = num2;
			num2 = num3;
			
		}
		
	}
	
}
