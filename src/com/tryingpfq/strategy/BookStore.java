package com.tryingpfq.strategy;
//定义客户端进行测试
public class BookStore {
     public static void main(String[] args) {
		//选择并创建需要使用的策略队形
    	 Member strategy =new AdvanceMember();
    	 //创建环境
    	 Cashier cashier =new Cashier(strategy);
    	 //计算价格
    	 double quote =cashier.quote(200);
    	 System.out.println("高级会员最终的价格为："+quote);
    	 
    	 strategy =new IntermediateMember();
    	 cashier =new Cashier(strategy);
    	 quote =cashier.quote(200);
    	 System.out.println("中级会员最终价格为："+quote);
	}
}
