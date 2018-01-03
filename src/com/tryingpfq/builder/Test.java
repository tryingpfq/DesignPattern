package com.tryingpfq.builder;

import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Director director=new Director();
		
		LenovoBuilter lenovoBuilter=new LenovoBuilter();
		
		director.construct(lenovoBuilter);
		
		Product lenovoProduct=lenovoBuilter.result();
		
		System.out.println(lenovoProduct);
		
		int[] i=new int[3];
	
		
		System.out.println(i[3]+"abc");
	}
    
}
