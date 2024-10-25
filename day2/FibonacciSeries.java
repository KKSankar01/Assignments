package week1.day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in)) {
			System.out.println("Enter the number: ");
			int n=number.nextInt();
			int firstNumber=0;
			int secondNumber=1;
			for(int i=0;i<=n;i++) {
				System.out.println(firstNumber);
				int temp=firstNumber;
				firstNumber=secondNumber;
				secondNumber=temp+secondNumber;
			}
		}
	}
}