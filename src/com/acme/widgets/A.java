package com.acme.widgets;

public class A {
	public A() {
		System.out.println("A on with no ints");
	}
	public A(int age) {
		System.out.print("A on with int ");
		System.out.println(age);
	}
	public A(String AA){
		System.out.println("Using A's copy of "+AA);
	}
	public void f(){
		System.out.println("do widget business ...");
	}
	public void g(){
		System.out.println("do monkey business ...");
	}
}
