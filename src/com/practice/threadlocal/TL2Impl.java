package com.practice.threadlocal;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TL2Impl {

	public static void main(String[] args) throws InterruptedException {

		TL2 tl2 = new TL2();
		tl2.setTSR();

		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		Runnable task = () -> tl2.setTSR();
		ScheduledFuture<?> future = executor.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);
		
		Thread t2 = new Thread(() -> tl2.setTSR());
		t2.start();
//		
		
		
		
	}

}
