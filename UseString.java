package Study.Study;

class UseString {
	public static void main(String[] args)
	throws java.io.IOException {
	char testString;
	
	System.out.println("Enter the line:");
	testString = (char) System.in.read();
	System.out.println("your line: " + testString);
	}
}