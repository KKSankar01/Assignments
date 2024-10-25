package week3.day6;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElement {
	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();
	        Collections.addAll(list, 1, 2, 3, 4, 10, 6, 8); // Example list with missing numbers
	        
	        // Sort the list
	        Collections.sort(list);
	        
	        // Find and print missing numbers
	        System.out.println("Missing numbers:");
	        for (int i = 0; i < list.size() - 1; i++) {
	            int current = list.get(i);
	            int next = list.get(i + 1);
	            
	            if (current + 1 != next) {
	                for (int j = current + 1; j < next; j++) {
	                    System.out.println(j);
	                }
	            }
	        }
	    }
}


