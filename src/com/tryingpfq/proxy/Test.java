package com.tryingpfq.proxy;
/**
 * 测试类
 * @author trying
 *
 */
public class Test {
	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl();
		
		jiaojiao.setName("娇娇");
		
		Proxy daili = new Proxy(jiaojiao);
		
		daili.GiveDolls();
		
		daili.GiveFlowers();
		
		daili.GiveChocolate();
	}

}
