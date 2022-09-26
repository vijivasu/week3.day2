package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g)Displaying the String without duplicate words	
 * h) print the each word
 */

public class RemDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		
		String[] split = text.split(" ");
		int maximumOccurance = 0;
		String maxCharacter = "";
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		for (String eachword : split) {
			if(map.containsKey(eachword)) {
				map.put(eachword, map.get(eachword)+1);
				//we 1+1
				//we 
				//{We=1, learn=1, java=3, basics=1, as=1, part=1, of=1, sessions=1, in=1, week1=1}
			}else {
				map.put(eachword, 1);
				//we - 1
			}
			
		}
	    
		System.out.println(map);
	
		
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> eachEntry : entrySet) {
			if(eachEntry.getValue()>maximumOccurance) {//0
				maximumOccurance=eachEntry.getValue();//1
				maxCharacter = eachEntry.getKey();//we
				
				if(maximumOccurance>1) {
					maxCharacter.replace(maxCharacter, " ");
				}
			
		}
			
	}
		System.out.println(maxCharacter+"--->"+maximumOccurance);
		
		
		for (Entry<String, Integer> eachEntry : entrySet) {
			if (eachEntry.getValue()==1) {
				System.out.print(eachEntry.getKey());
			}
		}
		
	}
	
	
}
		
		

