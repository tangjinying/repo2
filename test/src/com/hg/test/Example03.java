package com.hg.test;
class Point{
	int x,y;
	public Point() {
		
	}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x; 
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void movePoint(int mx,int my) {
		this.x=this.x+mx;
		this.y=this.y+my;
	}
	void show(){
		System.out.println("该点的坐标为"+"("+x+","+y+")");
	}
}
public class Example03{
	public static void main(String args[]) {
		Point p = new Point(1,1);
		p.movePoint(3,2);
		p.show();
	}
}