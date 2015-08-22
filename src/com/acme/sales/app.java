package com.acme.sales;

import com.acme.delegation.BD;
import com.acme.inheritance.BI;
import com.acme.widgets.A;

public class app {
		public static void main(String[] args) {
		System.out.println("using bi ...");
		BI bi = new BI(10);
		bi.f();
		bi.g();
		System.out.println("using bd ...");
		BD bd = new BD();
		bd.f();
		bd.g();
	}
}