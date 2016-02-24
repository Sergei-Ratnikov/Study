package Study.Study;

class TryMe {
	static int iDouble (int i) {
		return i * 2;		
	}
}

class StatMeth {
	public static void main(String[] args) {
		int index = 3;
		int yandex = 4;
		System.out.println(index);
		System.out.println(TryMe.iDouble(index));

		System.out.println(yandex);
		System.out.println(TryMe.iDouble(yandex));			
	}
}