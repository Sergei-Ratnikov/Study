package Study.Study;

import java.util.regex.Matcher;  
import java.util.regex.Pattern;

public class RegularExpressions {  
      
    public static void main(String[] args){  
        System.out.println("Cool check:");  
          
        System.out.println(checkWithRegExp("_@BEST"));  
        System.out.println(checkWithRegExp("vovan"));  
        System.out.println(checkWithRegExp("vo"));  
          
        System.out.println("\nBacon check:");

        System.out.println(test("BACON"));
        System.out.println(test("  BACON"));
        System.out.println(test("BACON  "));

		
		System.out.println("\nlink check:");
		
		System.out.println(testlink("trololo.com"));
        System.out.println(testlink("trololo.ua "));
        System.out.println(testlink("trololo.ua"));

		System.out.println("\ndice check:");
		
		//System.out.println(dice("3d6+1"));		
		System.out.println(dice("3d6+5"));
		System.out.println(dice("d10-27"));
		System.out.println(dice(" 30d100"));
		System.out.println(dice("30d4-0"));
		System.out.println(dice("0d"));
		System.out.println(dice("05d"));		
		System.out.println(dice("-5d"));

    }  
      
    public static boolean checkWithRegExp(String userNameString){  
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");  
        Matcher m = p.matcher(userNameString);  
        return m.matches();  
    }
	
	public static boolean test(String testString){  
        Pattern p = Pattern.compile("^BACON$");  
        Matcher m = p.matcher(testString);  
        return m.matches();  
	}
	
	 public static boolean testlink(String testString){  
		Pattern p = Pattern.compile(".+\\.(com|ua|ru)");  
        Matcher m = p.matcher(testString);  
        return m.matches(); 
	 }
	 
	 	public static boolean dice(String testString){
		//Pattern p = Pattern.compile("^(([1-9]?)|([1-9]\\d+))d(4|6|8|10|12|20|100)(['\\+'|'\\-'](([1-9]?)|([1-9]\\d+)))?$");
		Pattern p = Pattern.compile("^['\\ ']?([1-9](\\d+)?)?d(4|6|8|10|12|20|100)(['\\+'|'\\-'](([1-9](\\d+)?)?))?['\\ ']?$");
		// ['\\ ']?    ([1-9](\\d+)?)?   d   (4|6|8|10|12|20|100)   (  ['\\+'|'\\-'] ( ([1-9](\\d+)?)?  )  )?    ['\\ ']?

        Matcher m = p.matcher(testString);
        return m.matches(); 
	 }

}  
 