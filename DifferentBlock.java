package com.Array;

public class DifferentBlock {
	static {
		System.out.println("Static block1");
	}
	static {
		System.out.println("Static block2");
	}
	DifferentBlock(){
		System.out.println("Constucter when oject is created");
	}
	{
		System.out.println("Anonomuse block1");
	}
	{
		System.out.println("Anonomuse block2");
	}
	{
		System.out.println("Anonomuse block3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("main block");
     DifferentBlock df=new DifferentBlock();//call object contstructer
	}
	

}
