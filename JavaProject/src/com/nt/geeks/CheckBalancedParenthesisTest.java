package com.nt.geeks;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBalancedParenthesisTest {
	
	public static boolean balanceParenthesis(String s) {
		Deque<Character> stack=new ArrayDeque<Character>();
		
		for(int i=0;i<=s.length()-1;i++) {
			char x=s.charAt(i);
			if(x=='(' ||x=='[' || x=='{') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
				return false;
			
			char check;
			switch(x) {
			 case ')':
			 check=stack.pop();
			 	if(check=='}' || check==']')
			 		return false;
			 	break;
			 
			 case '}':
				 check=stack.pop();
				 	if(check==']' || check==')')
				 		return false;
				 	break;
			
			 case ']':
				 check=stack.pop();
				 	if(check==')' || check=='}')
				 		return false;
				 	break;
			}
		}
		
		return (stack.isEmpty());
	}
	
	
	//driver code	
	public static void main(String[] args) {
		String expr="{}";
		
		if(balanceParenthesis(expr))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
	
}
