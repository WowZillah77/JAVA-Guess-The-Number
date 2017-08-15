import java.util.Random;
import java.util.Scanner;

public class Main {

	public static int number, guess, maxValue;
	public static Scanner scan;
	public static Random rand;

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		rand = new Random();
		System.out.println("Please Enter a Maximum value to guess from:");
		maxValue = scan.nextInt();
		number = rand.nextInt(maxValue);

		System.out.print("please enter a guess:");
		while (guess != number) {
			guess = scan.nextInt();

			if (guess > number) {
				System.out.println("too high");
			}

			if (guess < number) {
				System.out.println("too Low");
			}
		}
		System.out.println("you Won");
	}
}
