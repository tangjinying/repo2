package com.hg.test;
class Circle{
	final double Pi = 3.14;
	double r,Perimeter,area;
	public Circle() {
		this.r=0.0;
	}
	public Circle(double a) {
		this.r = a;
	}
	public double getPerimeter() {
		Perimeter = 2*r*Pi;
		return Perimeter;
	}
	public double area() {
		area = r*r*Pi;
		return area;
	}
	public void show() {
		System.out.println("该圆形的周长为"+this.getPerimeter()+",面积为"+this.area());
	}
}
public class Example05 {
	public static void main(String args[]) {
		Circle circle = new Circle(3);
		Circle circle1 = new Circle();
		circle1.show();
		circle.show();
	}
}
