package com.tryingpfq.singleton;

public class Test {
     public static void main(String[] args) {
		Emperor emperor=Emperor.getInstance();
		emperor.emperorInfo();
		Emperor.emperorInfo();
		Emperor emperor1=Emperor.getInstance();
		emperor.emperorInfo();
	}
}
