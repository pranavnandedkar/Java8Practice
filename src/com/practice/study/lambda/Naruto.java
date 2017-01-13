package com.practice.study.lambda;

public class Naruto {
	public static void main(String[] args) {
		 Thread thread1 = new Thread(new Runnable() {
		    @Override
		    public void run(){
		        System.out.println("Task #1 is running");
		    }
		});
		 
		thread1.start();		
		
		
		
		new Thread(() -> { System.out.println("Task #2 is running"); }).start();;
		
		
	}
	
	
}
