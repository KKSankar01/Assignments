package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in)) {
			System.out.println("The palindrome number is: ");
			int n=number.nextInt();
			int reversedNumber=0;
			//We assign n to number1 so that we can work with the variable number1 without altering the original input-n. 
			int number1=n;
			int digit;
			for (;number1!=0;number1/=10) {
				digit=number1%10;
				reversedNumber=reversedNumber*10+digit;
			}
			if (reversedNumber==n) {
				System.out.println("This number is palindrome.");
			}else {
				System.out.println("This number is not a palindrome");
			}
		}
	}

}
