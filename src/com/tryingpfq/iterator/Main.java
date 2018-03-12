package com.tryingpfq.iterator;
//测试用例
public class Main {
    public static void main(String[] args) {
		ChineseFoodMenu chineseFoodMenu = new ChineseFoodMenu();
		chineseFoodMenu.add("宫保鸡丁");
		chineseFoodMenu.add("萍乡小炒肉");
		chineseFoodMenu.add("羊肉");
		chineseFoodMenu.add("烤鸭");
		
		Iterator iterator =chineseFoodMenu.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
