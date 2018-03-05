package com.tryingpfq.strategy;

public class Cashier {
     private Member member;
     
     public Cashier(Member member){
    	 this.member=member;
     }
     
     //计算应付的价格
     public double quote(double booksPrice){
    	 return this.member.calPrice(booksPrice);
     }
}
