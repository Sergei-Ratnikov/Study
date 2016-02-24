package Study.Study;

// Добавление конструкторов в класс TwoDShape.

class TwoDShape {
	private double width;
	private double height;
	
	// конструктор
	TwoDShape(double w, double h) {
	width = w;
	height = h;
	}
	
	// Методы доступа к переменным экземпляра width и height
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }
	void showDim() {
	System.out.println("Width and height are " + width + " and " + height);
	}
}

// Подкласс, производный от класса TwoDShape,
// для представления треугольников
class Triangle extends TwoDShape {
	
	private String style;
	Triangle(String s, double w, double h) {

	super(w, h); // вызвать конструктор суперкласса
	style = s;
	}
	
	double area() {
	return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
	System.out.println("Triangle is " + style);
	}
}

class Shapes4 {
	public static void main(String args[]) {
		Triangle tl = new Triangle ("isosceles", 4.0, 4.0);
		Triangle t2 = new Triangle("right", 8.0, 12.0);
		System.out.println("Infо for tl: ");
		tl.showStyle();
		tl.showDim();
		System.out.println("Area is " + tl.area());
		System.out.println();
		System.out.println("Info for t2: ") ;
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}
