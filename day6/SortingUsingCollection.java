package week3.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array1=new ArrayList<>();
		Collections.addAll(array1,"HCL","Wipro","Aspire Systems","CTS");
		Collections.sort(array1);
		Collections.sort(array1,Collections.reverseOrder());;
		System.out.println(array1);

	}

}
