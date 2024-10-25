package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] array= {1,4,3,2,8,6,7};
		Arrays.sort(array);
		System.out.println(array);
		for(int i=1; i<=array.length;i++) {
			if(i!=array[i-1]) {
				System.out.println(i);
				break;
			}
		}
	}
}
