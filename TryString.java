package Study;

public class TryString {
 
    public static void main(String[] args) {
    String text1 = "Hello";
        
    text1 = text1 + " world!";
    System.out.println(text1);
    
    // Превращение строки в число
    String xSrt = "3";
    String yStr = "2";
    
    int x = Integer.parseInt(xSrt);
    int y = Integer.parseInt(yStr);
    
    System.out.println(x + y);
    
    // массивы и строки
    
    int index = 4;    
    String[] arrayOfStrings = new String[index];
    
    
    for (index = 0; index < arrayOfStrings.length; index++) {
        arrayOfStrings[index] = text1 + index;
        System.out.println( arrayOfStrings[index] );
    }
    
    System.out.print( "~~~~~~\n");
    arrayOfStrings[0] = null;
    
    for (index = 0; index < arrayOfStrings.length; index++) {
        System.out.println( arrayOfStrings[index] );
    }
    
    System.out.print( "~~~~~~ \n");
    int[] arrayInt = new int[2];
    System.out.println( arrayInt[1] );
    
    
    
    } 
}
