package Study.Study;

// Простая иерархия классов.
// Класс, описывающий двумерные объекты,

class TwoDShape {
	double width;
	double height;
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}

// Подкласс класса TwoDShape для представления треугольников.
// Класс Triangle наследует от класса TwoDShape

class Triangle extends TwoDShape {
	String style;
	
	double area () {

	return width * height / 2;
	}
	
	void showStyle () {
	System.out.println("Triangle is " + style);
	}
}

class Shapes {
	public static void main(String args[]) {
		Triangle tl = new Triangle();
		Triangle t2 = new Triangle();
		// Bee члены класса Triangle, даже унаследовавшие от класса
		// TwoDShape, доступны из объектов типа Triangle.
		tl.width = 4.0;
		tl.height = 4.0;
		tl.style = "isosceles";
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "right";
		System.out.println("Info for tl: ");
		tl.showStyle();
		tl.showDim();
		System.out.println("Area is " + tl.area());
		System.out.println();
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}
