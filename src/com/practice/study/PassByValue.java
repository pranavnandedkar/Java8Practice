package com.practice.study;

import java.util.HashMap;

public class PassByValue {

	public synchronized void method(HashMap<String, String> hm) throws InterruptedException{
		hm.put("one", "sssss");
		System.out.println("====1");
		Thread.sleep(3000);
		System.out.println("====1");
	}

	public synchronized void method2(HashMap<String, String> hm) throws InterruptedException{
		hm.put("one", "sssss");
		System.out.println("====2");
		Thread.sleep(3000);
		System.out.println("====2");
	}

	public static void main(String[] args) throws InterruptedException {

		PassByValue p = new PassByValue();
		HashMap<String,String> hm = new HashMap<>();
		hm.put("one", "pppp");
		
		new Thread(){
			public void run() {
				try {
					p.method(hm);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
		
		new Thread(){
			public void run() {
				try {
					p.method2(hm);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();		
//		System.out.println(hm.get("one"));
	}
}
