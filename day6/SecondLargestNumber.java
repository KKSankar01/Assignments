package week3.day6;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {3,2,11,4,6,7};
		Arrays.sort(array);
		System.out.println("Sorted Array: "+ Arrays.toString(array));
		int secondLargest=array[array.length-2];
		System.out.println(secondLargest);
	}

}
