package com.nt.geeks;

import java.util.HashMap;
import java.util.Map;

class RemoveVowelTest {
	
	/*public static void main(String[] args) {
		int b=754897;
		int a=0;
		while(b>0) {
			a=a+(b%10);
			b=b/10;
		}
		
		System.out.println("a::"+a);
	}*/
	
	/*public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(null,"java");
		map.put(1,"AdvanceJava");
		map.put(1,"C");
		
		System.out.println(map.get(1));
		
	}*/
	
	/*static String removeVowel(String str) {
		return str.replaceAll("[aeiouAEIOU]","");
	}	
	
	public static void main(String[] args) {
		String str="Hello Welcome to java";
		
		System.out.println(removeVowel(str));
	
	}*/
	
	/* static String removeVowel(String s) {
		
		Character vowels[]= {'a','e','i','o','u','A','E','I','O','U'};
		
		List<Character> al=Arrays.asList(vowels);
		StringBuffer sb=new StringBuffer(s);
		
		for(int i=0;i<sb.length();i++) {
			if(al.contains(sb.charAt(i)))
				sb.replace(i,i+1,"");
			   i--;
		}
		return sb.toString();
	}
		
	//driver method to test code
	public static void main(String[] args) {
		String str="Hello Welcome";
		
		System.out.println(removeVowel(str));
	
	}
	*/
}
