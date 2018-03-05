package com.tryingpfq.strategy;
//定义初级会员
public class PrimaryMember implements Member{

	@Override
	public double calPrice(double bookPrice) {
		System.out.println("对于初级会员没有折扣哦");
		return bookPrice;
	}
}
