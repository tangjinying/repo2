package com.hg.test;

import java.util.function.ObjDoubleConsumer;

import java.lang.reflect.*;


interface a{
	public void show();
	int aaa=1;
}
class b{
	int aaa=0;
}
class demo extends b implements ObjDoubleConsumer<String>,a{
	int a =0;
	double b =1.1;
	String aaaString= "aaa";
	public demo() {
		// TODO Auto-generated constructor stub
	}
	demo(int a){
		
	}
	demo(int a,int b){
		
	}
	@Override
	public void accept(String t, double value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
public class Example02{
	private static Object object;
	private static Object object2;
	private static Object object3;

	public static void main(String args[]) {
		Class<?>  c1 = null;
		Class<?>  c2 = null;
		Class<?>  c3 = null;
		try {
			c1 = Class.forName("com.hg.test.demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor<?>[] constructors = c1.getConstructors();
		System.out.println(constructors[0]);
		Class<?> c[] = c1.getInterfaces();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getName());
		}
		System.out.println(c1.getSuperclass());
		System.out.println("%%%%%%%%%%%%");
		try {
			Method f=c1.getMethod("accept",String.class,double.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
