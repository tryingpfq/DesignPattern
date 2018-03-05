package com.tryingpfq.strategy;

//中级会员 买书可以有九折优惠的
public class IntermediateMember implements Member{

	@Override
	public double calPrice(double bookPrice) {
		System.out.println("对于中级会员的折扣为百分之90");
		return bookPrice*0.9;
	}
      
}
