package com.practice.study.lambda;

public class LambdaWithRunnable {
	public static void main(String[] args){
		Runnable runnerImpl = () -> System.out.println("printing the run method in thread....");
		Thread t1 = new Thread(runnerImpl);
		t1.start();
	}
}
