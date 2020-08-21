package com.hg.test;
class Rectangle {
	float width,height,zc,area;
	public Rectangle () {
		
	}
	public Rectangle (float width,float height) {
		this.width=width;
		this.height = height;
	}
	public float zc() {
		zc= (width+height)*2;
		return zc;
	}
	public float area() {
		area = width*height;
		return area;
	}
	public void show() {
		System.out.println("该矩形的周长为"+this.zc()+",面积为"+this.area());
	}
}
public class Example04 {
	public static void main(String args[]) {
		Rectangle re = new Rectangle (2,5);
		re.show();
		System.out.println(re.getClass().getMethods());
	}
}
