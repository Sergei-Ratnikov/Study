/*

массив объектов

BigClass умеет создавать массив объектов SimpleClass,
передавать им значения через конструктор, и печатать.

*/


package javase02.t02;

class SimpleClass {
	int num ;

    public SimpleClass(int num) {
		this.num = num;
    }
}

class BigClass {
    int index;
	SimpleClass[] set;
	
	//конструктор - 1
	public BigClass(int index) {
		this.index = index;
		this.set = new SimpleClass[index];
	}
		
	void entering() {
		for (int i = 0; i < index; i++) {
			//конструктор - 2
			set[i] = new SimpleClass(i);
		}
	}
	
	void printer() {
		System.out.println();
		for (int i = 0; i < index; i++) {
			System.out.print(set[i].num + " ");
		}
	}
}

public class ClassSet {
	public static void main(String[] args) {
		BigClass testClass = new BigClass(5);
		testClass.entering();
		testClass.printer();
	}
 }
