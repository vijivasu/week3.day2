package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				int[] data = {3,2,11,4,6,7};
 
				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				
				
				int temp =0;
				int length = data.length;
				
				for(int i=0;i<data.length;i++) {
					for(int j=i+1;j<data.length;j++) {
						if(data[i]>data[j]) { // i=3 and j=2
													
							temp = data[i]; //temp =3
							data[i] = data[j]; //i =2
							data[j] = temp; //j= 3
							break;
						}
					}
					System.out.println(data[i]);
					
					
				}
				System.out.println("Second largest number is: "+data[length-2]);
			
	}

}
