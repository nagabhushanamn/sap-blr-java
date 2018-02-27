package com.multi;

public class Ex8 {
	
	public static void main(String[] args) {
		
		Thread thread1=new Thread(()->{
			System.out.println(Thread.currentThread().getPriority());
		});
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		
	}

}
