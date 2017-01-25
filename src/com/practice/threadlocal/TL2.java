package com.practice.threadlocal;

public class TL2 {

	ThreadLocal<String> srNo = new ThreadLocal<>();
	public void setTSR(){
		System.out.println(getTSR());
		srNo.set(Math.random()+"");
		System.out.println(getTSR());
	}

	public String getTSR(){
		return srNo.get();
	}
	
	
}


