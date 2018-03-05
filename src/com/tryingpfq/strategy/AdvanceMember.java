package com.tryingpfq.strategy;

//高级会员  买书可以享受8折优惠
public class AdvanceMember implements Member{

	@Override
	public double calPrice(double bookPrice) {
		System.out.println("高级会员可以享受8折优惠哦");
		return bookPrice * 0.8;
	}

}
