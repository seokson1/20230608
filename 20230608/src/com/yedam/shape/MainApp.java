package com.yedam.shape;

public class MainApp {
	public static void main(String[] args) {
		Shape shape = new Triangle();
		shape.setColor("White");
		if (shape instanceof Triangle) {
			((Triangle)shape).draw();
		}
		shape = new Circle();
		if(shape instanceof Circle) {
			((Circle)shape).move();
			((Circle)shape).draw();
		}
	}
}
