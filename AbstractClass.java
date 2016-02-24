// Создание абстрактного класса.
// Теперь класс TwoDShape юляется абстрактным.
package Study.Study;

abstract class TwoDShape {

	private double width;
	private double height;
	private String name;
	
	// Конструктор no умолчанию.
	TwoDShape() {
		width = height = 0.0;
		name = "null";
	}
	
	// Параметризированный конструктор.
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	// построить объект с одинаковыми значениями
	// переменныx экземпляра width и height
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	
	// построить один объект на основании другого объекта
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	// Методы доступа к переменным width и height
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }
	String getName() { return name; }
	void showDim() { System.out.println("Width and height are " + width + " and " + height); }
	
	// Теперь метод area() является абстрактным.
	abstract double area();
}

// Подкласс, производный от класса TwoDShape, для представления треугольников,
class Triangle extends TwoDShape {
	private String style;
	
	// Конструктор no умолчанию.
	Triangle() {
	super();
	style = "null";
	}
	
	// Конструктор класса Triangle.
	Triangle(String s, double w, double h) {
	super(w, h, "triangle");
	style = s;
	}
	
	// Конструктор с одним аргументом для построения треугольника,
	Triangle(double x) {
	super (x, "triangle");
	style = "isosceles";
	}

	// построить один объект на основании другого объекта
	Triangle(Triangle ob) {
	super(ob); // передать объект конструктору класса TwoDShape
	style = ob.style;
	}
	
	double area() {	return getWidth() * getHeight() / 2; }
	
	void showStyle() { System.out.println("Triangle is " + style); }
}

// Подкласс, производный от класса TwoDShape,
// для представления прямоугольников,
class Rectangle extends TwoDShape {

	Rectangle() { super(); }

	Rectangle(double w, double h) { super(w, h, "rectangle"); }

	Rectangle(double x) { super(x, "rectangle"); }

	// построить один объект на основании другого объекта
	Rectangle(Rectangle ob) { super(ob); } // передать объект конструктору класса TwoDShape

	boolean isSquare() {
		if (getWidth() == getHeight()) return true;
		return false;
	}
	
	double area() {	return getWidth() * getHeight(); }
}


class AbstractClass {
	public static void main(String args[]) {
		TwoDShape shapes[] = new TwoDShape[4];
		shapes[0] = new Triangle("right", 8.0, 12.0);
		shapes[1] = new Rectangle(10);

		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		for(int i=0; i < shapes.length; i++) {
		System.out.println("object is " + shapes [i].getName());
		System.out.println("Area is " + shapes[i].area());
		System.out.println();
		}
	}
}