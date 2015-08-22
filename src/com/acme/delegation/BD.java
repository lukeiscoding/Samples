package com.acme.delegation;

import com.acme.widgets.A;

public class BD {
	A a = new A();
	public BD(){
		System.out.println("BD is on!");
	}
	public void f() {
		a.f();
	}
	public void g() {
		a.g();
	}
}