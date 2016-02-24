package Study.Study;

// Особенности применения перечисления Transport.
// Объявление перечисления.
class ListOfInt {
	private static int[] list = {65, 55, 601, 70, 25};
	static int Elem(int i) { return list[i]; }
}

enum Transport {

	// ListOfInt q = new ListOfInt();
	//		System.out.println(q.list[2]);

	CAR(65), TRUCK(55), AIRPLANE(ListOfInt.Elem(2)), TRAIN(70), BOAT(25);
	
	int speed; // объявление переменной экземпляра
	Transport(int s) { speed = s; } // конструктор
	int getSpeed() { return speed; } // метод
 	
	}
class EnumDemo1 {
	public static void main(String[] args)	{
		System.out.println(ListOfInt.Elem(2));

		Transport tp;				// Объявление ссылки на перечисление Transport.

		System.out.println("Speed of airplane: " + Transport.AIRPLANE.speed + "\n");	// вывести перечислимое значение

		
		tp = Transport.TRAIN;
		// Проверка равенства двух объектов типа Transport.
		if(tp == Transport.TRAIN) // сравнить два перечислимых значения
		System.out.println("tp contains TRAIN.\n");

		
		switch(tp) {
			case CAR:
				System.out.println("A car carries people.");
				break;
			case TRUCK:
				System.out.println("A truck carries freight.");
				break;
			case AIRPLANE:
				System.out.println("An airplane flies.");
				break;
			case TRAIN:
				System.out.println("A train runs on rails.");
				break;
			case BOAT:
				System.out.println("A boat sails on water.");
				break;
		}
		
		Transport allTransports[] = Transport.values();
		for(Transport t : allTransports)
			System.out.print(t.getSpeed() + " ");
	}
}