package com.nt.programs;


public class ReverseString {

	public static void main(String[] args) {
		String str="Hello World";
		System.out.println(reverseStringwithSB(str));
		System.out.println(reverseStringwithManually(str));
	}
	
	public static String reverseStringwithSB(String str) {
	   return new StringBuilder(str).reverse().toString();
	}
	
	
	public static String reverseStringwithManually(String str) {
		StringBuilder sb=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
			
		}
		return sb.toString();
		
		
	}

}
