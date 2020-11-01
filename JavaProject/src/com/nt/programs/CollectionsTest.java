package com.nt.programs;

import java.util.HashSet;
import java.util.Set;

public class CollectionsTest {
	
	/*
	  public static Set m(Set <Object>a,Set <Object>b){
	     a.retainAll(b);
	     return a;
	  }
	 public static void main(String [] args){
	     Object [] o1={"james gosling","java","c","c#"};
	     Object [] o2={"Java",".net","perl","james gosling"};
	  
	     Set <Object> s1=new HashSet();
	        for(Object o:o1)
	          s1.add(o);
	     Set <Object> s2=new HashSet();
	        for(Object o:o2) 
	          s2.add(o);
	     System.out.println(m(s1,s2)); 
	 }  */
		
	
	/*public static Set method(Set<Object> s1,Set<Object> s2) {
		s1.retainAll(s2);//remove all his element from set that are contained
		return s1;
	}
	
	public static void main(String[] args) {
		Object[] o1= {"java","HK","core","jsp"};
		Object[] o2= {"Natraj","java","jsp","babuji"};
		
		Set<Object>s1=new HashSet();
			for (Object o : o1) {
				s1.add(o);
			}
			
		Set<Object>s2=new HashSet();
			for (Object o : o2) {
				s2.add(o);
			}
			
		System.out.println(method(s1,s2));
	}
	
	
	

}
*///======================================================
/*class MyThread extends Thread{
	  MyThread d;
	  MyThread(){
	     d=new MyThread("sagar");
	  }
	
	public class Practice 
	{  
	   
	 public static void main(String [] args){
	  MyThread t=new MyThread();
	     
	 }  
	}*/
//=============================================================
/*public class Practice 
{  
   
 public static void main(String [] args){
   int g=2;  	
   System.out.println(++g *8); 
 }  
}
*/
//=================================================================		
	/*public static String[] sortString(String[] s) {
		Arrays.sort(s);
		return s;
	}	
	public static void main(String[] args) {
		String[] str= {"neha","akash","ravi","animseh"}; 
		System.out.println(Arrays.toString(sortString(str)));
	}
	*/
//-----------------------------------------------------------
	/*public static boolean reverseString(String s) {
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		
		if(rev.equals(s)) 
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverseString("madam"));
	}*/
}



