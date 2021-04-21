package sec08.exam04_overloading;

public class Calculator {
	//필드
	//생성자
	//메소드
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
