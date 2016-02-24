package Study.Study;
import java.util.*;

class JustClass {
	private int j = 0; //значение по умолчанию, в данном примере - скорость 
	JustClass(int jj) { j = jj; }
	public void putJ(int jj) {j = jj; } //??? подумать, почему в main приходится пользоваться отдельным методом и не получается передавать значения объекту через конструктор, если объект - элемент перечисления
	public int getJ() { return j; }
} 

class JustArray {
	static ArrayList<JustClass> justArray = new ArrayList();
	static {
	justArray.add(new JustClass(15)); //тоже значения по умолчанию, в main можно подставить любые другие
	justArray.add(new JustClass(25));
	justArray.add(new JustClass(35));
	}
	static JustClass ElemOfArray(int i) { return justArray.get(i); }
	
	static void ChangeElemOfArray(int i, int value) {  // метод заменяет i-й элемент justArray на новый объект с параметром value
		justArray.add(new JustClass(value));
		//int s = justArray.size() - 1; 
		justArray.set(i, justArray.get(justArray.size() - 1));
		justArray.remove(justArray.size() - 1);
	}
	
}

/* 
для чего нужен этот Array?
Сначала я попробовал что-то типа 

enum Transport { int a = 10, b = 20, c = 30;  CAR(a), TRUCK(b), ...
	
но это не сработало.
Но зато получилась такая штука:

class ListOfInt {
	static int[] list = {10, 20, 30};
	static int getI(int i) { return list[i]; }
}
enum Transport { CAR(ListOfInt.getI(0)), ...

У меня не получилось напрямую поместить объекты в качестве переменных перечисления enum Transport,
зато прокатило как экземпляры списка/коллекции.
Надо придумать, как обойтись без списка.
 */

enum Transport {
CAR(JustArray.ElemOfArray(0)), TRUCK(JustArray.ElemOfArray(1)), AIRPLANE(JustArray.ElemOfArray(2));
	
JustClass speed; // объявление переменной экземпляра
Transport(JustClass s) { speed = s; } // конструктор
JustClass getSpeed() { return speed; } // метод
	}
class EnumDemo3 {
	public static void main(String[] args)	{
		
		//System.out.println(ListOfInt.getI(2));
		Transport tp;	// Объявление ссылки на перечисление Transport.

		System.out.println("Speed of airplane: " + Transport.AIRPLANE.speed.getJ() + "\n");	
		Transport.AIRPLANE.speed.putJ(37); // внесение изменения в переменную (объект!!) перечисления через перечисление
		System.out.println("new (37) Speed of airplane: " + Transport.AIRPLANE.speed.getJ() + "\n");	
		
		System.out.println("Put new value! 38!");
		JustArray.ChangeElemOfArray(2, 38);   // внесение изменения в переменную (объект!!) перечисления через метод объекта-списка

		System.out.println("new (38) Speed of airplane: " + Transport.AIRPLANE.speed.getJ());  // а вот тут не работает ((((
		
		Transport allTransports[] = Transport.values();
		for(Transport t : allTransports)
			System.out.print(t + " ");
	}
}