package com.nt.programs;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
			int numbers[]= {-2,3,7,4,8};
			int target=6;
			int result[]=getTwoSumIndexes(numbers,target);
		   System.out.println(result[0]+" "+result[1]);

	}
	public static int[] getTwoSumIndexes(int []numbers,int target) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<=numbers.length;i++) {
			int delta=target-numbers[i];
			
			if(map.containsKey(delta)) {
				return new int[] {i,map.get(delta)};
			}
			
			map.put(numbers[i],i);
		}
		
		
		return new int[] {-1,-1};
		
	}

}
