package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindMostDupNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String str = "abbaba";
		char[] charArray = str.toCharArray();
		int maxvalue = 0;
		char maxOccur = str.charAt(0);
				
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<charArray.length;i++) {
		map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);//a=1 , b=1
		if(map.get(charArray[i])> maxvalue) { //1>0
		maxOccur= charArray[i]; //maxOccur = a
		maxvalue = map.get(charArray[i]); //maxvalue = 1
		}
				
			
		}
		System.out.println(maxOccur);
		
	}

}
