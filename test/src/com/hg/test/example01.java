package com.hg.test;

import java.util.concurrent.locks.*;
class Resource{
	private String name;
	private Lock lock = new ReentrantLock();
	private Condition con =lock.newCondition();
	private boolean flag=false;
	private int count=1;
	public void set(String name) {
		lock.lock();
		
		try {
			while (flag) {
				try {
					con.await();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			
		this.name = name+count;
		count++;
		System.out.println(Thread.currentThread().getName()+",,,"+this.name);
		flag = true;
		con.signalAll();
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
		
	}
	public void out() {
		lock.lock();
		
		try {
			while(!flag) {
				try {
					con.await();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println(Thread.currentThread().getName()+this.name);
			flag=false;
			con.signalAll();
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}
}
class Producer implements Runnable{
	private Resource r;
	public Producer(Resource r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
	public void run() {
		while(true) {
			r.set("面包");
		}
	}
}
class consumer implements Runnable{
	private Resource r;
	consumer(Resource r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
	public void run() {
		while(true) {
			r.out();
		}
	}
}class example01{
	public static void main(String[] args) {
		Resource  r = new Resource();
		Producer p = new Producer(r);
		consumer c = new consumer(r);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(c);
		Thread t4 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}