package Study.Study;
import java.util.*;

class JustClass {
	private int j = 0; //значение по умолчанию
	JustClass(int jj) { j = jj; }
	public void putJ(int jj) {j = jj; } //??? подумать, почему приходится пользоваться отдельным методом и не получается передавать значения объекту через конструктор, если объект - элемент перечисления
	public int getJ() { return j; } 
} 

class JustArray {
	static ArrayList<JustClass> justArray = new ArrayList();
	static {
	justArray.add(new JustClass(15));
	justArray.add(new JustClass(25));
	justArray.add(new JustClass(35));
	}
	static JustClass ElemOfArray (int i) { return justArray.get(i); }
}

class ListOfInt {
	static int[] list = {10, 20, 30};
	static int Elem(int i) { return list[i]; }
}

enum Transport {

CAR(JustArray.ElemOfArray(0)), TRUCK(JustArray.ElemOfArray(1)), AIRPLANE(JustArray.ElemOfArray(2));
	
JustClass speed; // объявление переменной экземпляра
Transport(JustClass s) { speed = s; } // конструктор
JustClass getSpeed() { return speed; } // метод

	
	}
class EnumDemo2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args)	{
		System.out.println(ListOfInt.Elem(2));
		System.out.println(JustArray.ElemOfArray(2).getJ());
		
		
		Transport tp;				// Объявление ссылки на перечисление Transport.

		System.out.println("Speed of airplane: " + Transport.AIRPLANE.speed.getJ() + "\n");	// вывести перечислимое значение
		Transport.AIRPLANE.speed.putJ(37);
		System.out.println("new Speed of airplane: " + Transport.AIRPLANE.speed.getJ() + "\n");	// вывести перечислимое значение
			
		Transport allTransports[] = Transport.values();
		for(Transport t : allTransports)
			System.out.print(t + " ");
	}
}