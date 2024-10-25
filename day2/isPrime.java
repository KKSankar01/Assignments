package week1.day2;

public class isPrime {
	public static void main(String[] args) {
		int number=6;
		System.out.println("Entered number is:"+number);
		int count=0;
		if(number==2) {
			System.out.println("This a prime number");
		}
		else {
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(number+" is a prime number");
			}
			else {
				System.out.println(number+" is not a prime number");
			}
		}
		}
	}