package week3.day2;

import java.util.Arrays;
import java.util.Collections;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				int[] arr = {1,2,3,4,5,6,8};
				int count = 1;

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
			
				
				Arrays.sort(arr); //{1,2,3,4,6,7,8}
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!= i + count) {
						System.out.println(i + count);
						count++;
						break;
					}
					
						
						
						
					
					
				}
				
	}

}
