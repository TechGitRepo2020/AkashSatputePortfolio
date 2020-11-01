package com.nt.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PatternDemo1 {

	public static void main(String[] args) {

		/*int []a= {12,23,32,34,53};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element to find");
		int key=sc.nextInt();
		int low=0;        
		int high=a.length-1;
		int mid=0;
		
		while(low<=high) {
			 mid=(low+high)/2;				//binary search
			 
			if(key<a[mid]) {
			   high=mid-1;
			}
			else if(key>a[mid]) {
				 low=mid+1;
			}
			else if(key==a[mid]) {
				System.out.println("element found at "+mid+" index");
				break;
			}
			 
			
		}
		if(low>high)
			System.out.println("element not found");
		
		
		*/
		
//=========================================================
		/*
		int []a= {23,12,34,32,53};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.to find");
		int key=sc.nextInt();			//linear search
		int flag=0;
		
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==key) {
				System.out.println("element found at "+i+" index");
				flag=flag+1;
			}
		}
		if(flag==0)
			System.out.println("element not found");
		*/
//===============================================================
		/*ArrayList<Integer> al=new ArrayList();
		
		al.add(23);
		al.add(13);
		al.add(24);
		al.add(45);
		al.add(22);
		
		Collections.sort(al);
		
		for(int i:al) {
			System.out.println(i);
		}*/
//====================================================================
		/*	Scanner sc=new Scanner(System.in);
			System.out.println("enter String::");
			String str=sc.next();
			String b="";
			
			for(int i=str.length()-1;i>=0;i--)
			{
				b=b+str.charAt(i);
			}
			
			if(b.equals(str))
				System.out.println("String is palindrome");
			else 
				System.out.println("String is not palindrome");
		*/		
		
//=========================================================================
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter three number::");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) 
			System.out.println(a+" ");
		else if(b>c && b>a) 
			System.out.println(b+" ");
		else 
			System.out.println(c+" ");*/
	
		
//=========================================================================
				
		/*String str="Deepak";
		int len=str.length();
		String rev=" ";
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println("reverse" +rev);
		*/

		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter any no::");
				int n=sc.nextInt();
				 int rev=0,rem=0;
				while(n!=0) {
					rem=n%10;
					rev=rev*10+rem;
					n=n/10;
					
				}
				System.out.println(rev+" ");*/
				
//=========================================================================	
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter any no::");
		int no=sc.nextInt();
		
		int a=0,b=1,c=0;
		System.out.print(a+" "+b);
		for(int i=1;i<=no-2;i++) {
				c=a+b;
				a=b;
				b=c;				
			System.out.print(" "+c);
		}
		*/
		
		/*System.out.println("enter any no::");
		int no=sc.nextInt();
		int count=0;
		for(int i=2;i<=no-1;i++) {
			
			if(no%i==0)
				count=count+1;
			
		}
		if(count>0)
			System.out.println("no is not prime");
		else
			System.out.println("no is prime");
		*/
			
			
			for(int i=1;i<=5;i++) {
				
				for(int j=5;j>i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				for(int l=2;l<=i;l++) {
					System.out.print("*");
				}
				System.out.println();
			
			}
		
		/*for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}	*/	

	}
}
