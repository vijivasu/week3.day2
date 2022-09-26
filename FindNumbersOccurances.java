package week3.day2;

import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		
		
		/*
		 *1. Create Map --> Tree Map
		 *2. For Lo 
		 * 
		 * 
		 */
		
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		int maxOccurance = 0;
		int maxinput = 0;
			
		int length = input.length;
		System.out.println(length);
		
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for (int digit : input) {
			
			if(map.containsKey(digit)) {
				map.put(digit, map.get(digit)+1); 
				
			}else {
				map.put(digit,1);
			}
			
		}
		System.out.println(map);
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Entry<Integer,Integer> eachentry: entrySet) {
			if(eachentry.getValue()>maxOccurance) {
				maxOccurance = eachentry.getValue();
				maxinput = eachentry.getKey();
				if(maxOccurance>2) {
					System.out.println(maxinput +"--->"+maxOccurance);
				}
				}
			
			
		}
							
		}
		
	
		
	}


