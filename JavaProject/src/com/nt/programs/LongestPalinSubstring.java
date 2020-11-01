package com.nt.programs;

import java.math.BigInteger;
import java.util.Scanner;

//public class Test {
	//public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter n value::");
		int n=s.nextInt();	
		
		for(int i=1;i<=n;i++) {
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}			
			System.out.println();
		}*/
		
		/*String s1="geeksofgeeks";
		StringBuffer sb=new StringBuffer(s1);
		sb=sb.reverse();
		
		String s2=new String(sb);
		System.out.println(sb);*/
		
		/*
		String s1="persistenceBoy";
		String s="";
		for(int i=s1.length()-1;i>=0;i--) {
			s=s+s1.charAt(i);
		}
		System.out.println(s);*/
		
		/*String s="00000123459";
		StringBuffer sb=new StringBuffer(s);
		int i=0;
		StringBuffer sb1=null; 
		while(i<s.length() && s.charAt(i)=='0') {
			i++;
			sb1 = new StringBuffer(s); 
			  
		        sb1.replace(0, i, ""); 
		  
		}
		
		System.out.println(sb1.toString());   
		*/
		
		/*String s1="      persistence Boy    ";
		s1=s1.trim();
		System.out.println(s1);*/
		/*
		 Scanner s = new Scanner(System.in);
	        while(s.hasNextLine()){    
	        int N = Integer.parseInt(s.nextLine());
	 
	            for (int i = 1; i <= N; i++) {
	                  BigInteger fact = new BigInteger("1");
	                     
	                        String numberSTR = s.nextLine();
	                     int number = Integer.parseInt(numberSTR);
	                 
	                     for(int j=number ;j>=1 ; j--){
	                         fact = fact.multiply(BigInteger.valueOf(j));
	                     }
	                     System.out.println(fact);
	                    }
	                
	                 
	            }*/
		
		
		public class LongestPalinSubstring { 
		    // A utility function to print 
		    // a substring str[low..high] 
		    static void printSubStr(String str, 
		                            int low, int high) 
		    { 
		        System.out.println( 
		            str.substring( 
		                low, high + 1)); 
		    } 
		  
		   static int longestPalSubstr(String str) 
		    { 
		        // The result (length of LPS) 
		        int maxLength = 1; 
		  
		        int start = 0; 
		        int len = str.length(); 
		  
		        int low, high; 
		  
		      // palindromes 
		        for (int i = 1; i < len; ++i) { 
		            low = i - 1; 
		            high = i; 
		            while (low >= 0 && high < len 
		                   && str.charAt(low) 
		                          == str.charAt(high)) { 
		                if (high - low + 1 > maxLength) { 
		                    start = low; 
		                    maxLength = high - low + 1; 
		                } 
		                --low; 
		                ++high; 
		            } 
		  
		            low = i - 1; 
		            high = i + 1; 
		            while (low >= 0 && high < len 
		                   && str.charAt(low) 
		                          == str.charAt(high)) { 
		                if (high - low + 1 > maxLength) { 
		                    start = low; 
		                    maxLength = high - low + 1; 
		                } 
		                --low; 
		                ++high; 
		            } 
		        } 
		  
		        System.out.print("Longest palindrome substring is: "); 
		        printSubStr(str, start, start + maxLength - 1); 
		  
		        return maxLength; 
		    } 
		  
		    public static void main(String[] args) 
		    { 
		  
		        String str = "forgeeksskeegfor"; 
		        System.out.println("Length is: " + longestPalSubstr(str)); 
		    } 
		} 
		

