/*

массив объектов

BigClass умеет создавать массив объектов SimpleClass,
передавать им значения через конструктор, и печатать.

почти пошаговый ввод )

*/



package Study.Study;

class SimpleClass {
	String text;

    public SimpleClass(String text) {
		this.text = text;
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
	
	void entering(String ... texttext) {  // Использование аргументов переменной длины (см. пример VarArgs)
		for (int i = 0; i < index; i++) {
				set[i] = new SimpleClass(texttext[i]);
		}
	}
	
	void printer() {
		System.out.println();
		for (int i = 0; i < index; i++) {
			System.out.print(set[i].text + " ");
		}
	}
}

public class ClassSet1 {
	public static void main(String[] args) {
		BigClass testClass = new BigClass(3);
		testClass.entering("qwerty", "asdfg", "zxcvbn");
		testClass.printer();
	}
}

/*

package Study.Study;
class VarArgs {
	
	static void vaTest(String msg, int ... v) {
		System.out.println(msg + v.length);
		System.out.println("Contents : ") ;
		
		for(int i=0; i < v.length; i++)
			System.out.println("arg " + i + ": " + v[i]);
		
		System.out.println ();
	}
	
	public static void main(String[] args)
	{
	vaTest("One vararg: ", 10);
	vaTest("Three varargs: ", 1, 2, 3);
	vaTest("No varargs: ");
	}
	
}

*/
 
