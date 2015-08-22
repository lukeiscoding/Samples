package com.acme.inheritance;

import com.acme.delegation.BD;
import com.acme.widgets.A;

public class BI extends A{
	static String zhong = "中二病没得治";
	public BI(){
		super(10);
		System.out.println("BI is on! wni");
	}
	public BI(int aa){
		super(zhong);
		System.out.println("BI is on with "+aa);
	}
	public BI(int bb, int bbb){
		super(bb);
		System.out.println("BI is on with "+bb+" "+bbb);
		BD wBd = new BD();
		System.out.println("wdf?");
	}
}