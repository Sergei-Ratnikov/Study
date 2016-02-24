package Study.Study;

enum Discipline { HERBOLOGY("Herbology", "pass"), POTIONS("Potions", "pass"),
	TRANSFIGURATION("Transfiguration", "grade"), CHARMS("Charms", "grade"), ARITHMANCY("Arithmancy", "grade");

	private final String title;
	private final String type;
	
	private Discipline(String title, String type) {
		this.title = title;
		this.type = type;
	}
	
	@Override
	public String toString(){
		return title;
	}
	
	public String typeOf(){
		return type;
	}
}

class EnumDemo4 {
	public static void main(String[] args)	{
		//Discipline dis;
		//dis = Discipline.HERBOLOGY;
					
		String s = "TRANSFIGURATION";
		Discipline t = Discipline.valueOf(s);
		
		
		boolean q = ("grade" == t.typeOf());
		System.out.println("Discipline: " + t.toString() + " " + t.typeOf() + " " + q + ", position is " + Discipline.valueOf(s).ordinal() );

		String SS = "Transfiguration";
		boolean finder = true;
		Discipline[] alldis = Discipline.values();
		for(Discipline dis : alldis) {
			if (dis.toString() == SS) { finder = false; }
		}
		System.out.println(SS + " is " + finder);


/* 		switch(tp) {
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
		 */
	}
}