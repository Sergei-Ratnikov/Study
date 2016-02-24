/* Использование аргументов переменной длины
   вместе с обычными аргументами
   Здесь msg - обычный аргумент
   V - аргумент переменной длины
*/
   
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