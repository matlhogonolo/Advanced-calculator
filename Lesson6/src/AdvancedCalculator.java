import java.util.Scanner;

public class AdvancedCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {

			int num1, num2;
			int answer = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println(" Operation(s) \n " + 
			"(1) Addition \n (2) Minus "
					+ "\n (3) Divide \n (4) Multiplication");

			int input = 0;

			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("Num 1");

				num1 = sc.nextInt();
				System.out.println("num 2");

				num2 = sc.nextInt();

				answer = addition(num1, num2);
				if (answer > 50) {
					answer = answer - 2;

				}
				System.out.println("Answer = " + answer);
				break;
			case 2:
				System.out.println("Num 1");
				num1 = sc.nextInt();
				System.out.println("num 2");

				num2 = sc.nextInt();

				answer = subtraction(num1, num2);
				if (answer > 70) {
					answer = answer % 5;

				}
				System.out.println("Answer = " + answer);
				break;

			case 3:
				System.out.println("Num 1");
				num1 = sc.nextInt();
				System.out.println("num 2");

				num2 = sc.nextInt();

				answer = division(num1, num2);
				if (answer > 10) {

					answer = answer + 2;
				}
				System.out.println("Answer = " + answer);
				break;

			case 4:
				System.out.println("Num 1");
				num1 = sc.nextInt();
				System.out.println("num2");

				num2 = sc.nextInt();

				answer = multiplication(num1, num2);
				
				if (answer > 30) {
					
					answer = (int) (answer * 1.2);
					
				}
				System.out.println("Answer = " + answer);
				break;

			}

		}

	}

	public static int addition (int num1,int num2) {
		return num1 + num2;
		
	}
	public static int subtraction (int num1,int num2) {
		return num1 - num2;
		
	
	}
	public static int division (int num1,int num2) {
		return num1 / num2;
	
	}
	public static int multiplication (int num1, int num2) {
		return num1 * num2;
	}
}
