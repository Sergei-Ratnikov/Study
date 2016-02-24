package Study.Study;
import java.util.*;

class Other {
	static String hello = "Hello";
}

public class StringLiteralPool {
    public static void main(String[] args) {
        String s1 = "Hello";
		String s2 = new StringBuffer("He").append("llo").toString();
		String s3 = s2.intern();
		System.out.println("s1 == s2? " + (s1 == s2) );
		System.out.println("s1 == s3? " + (s1 == s3) );
		
		String hello = "Hello", lo = "lo";
		System.out.println(hello == "Hello");
		System.out.println(Other.hello == "Hello");
		System.out.println(hello == ("Hel" + "lo"));
		System.out.println(hello == ("Hel" + lo));
		System.out.println(hello == ("Hel" + lo).intern());	
		
		StringBuilder sb = new StringBuilder();
		sb.append("Java StringBuilder");
		sb.append(" example");
		sb.insert(5, "insert ");
		sb.setCharAt(2, 'y');
		System.out.println("StringBuilder " + sb);
		
		Formatter formatter = new Formatter();
		boolean b1 = true;
		Boolean b2 = null;
		formatter.format("1. - %b, %b\n", b1, b2);
		System.out.println(formatter);
		Timer t = new Timer();
		formatter.format("2. - %t", t);
		System.out.println(formatter);
		
    }
}