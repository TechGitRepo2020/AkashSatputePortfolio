package com.nt.programs;

import java.util.Arrays;

public class Stack {
	
	private int array[];
	private int capacity;
	private int top;
	
	public Stack(int capacity) {
		this.array=new int[capacity];
		this.capacity=capacity;
		this.top=-1;
	}
	
	public void push(int item) {
		if(isFull())
			throw new RuntimeException("Stack is full");
		array[++top]=item;
	}
	
	public int pop() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty");
		return array[top--];
	}

	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty");
		return array[top];
	}
	
	public boolean isFull() {
		return top==capacity-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}

	public static void main(String[] args) {
		Stack st=new Stack(5);
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		System.out.println(st);
		
		st.pop();
		st.pop();
		st.pop();
		
		st.peek();
		System.out.println(st);
		
		st.pop();
		st.pop();
		
	
			
		System.out.println(st);
	}

	@Override
	public String toString() {
		return "Stack [array=" + Arrays.toString(array) + ", capacity=" + capacity + ", top=" + top + "]";
	}
	
	
	
}
