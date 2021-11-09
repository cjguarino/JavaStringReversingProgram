import java.util.Scanner;
/**
 * Class: WordReversingProgram
 * @author cjguarino1
 * Date: March 20th, 2017
 */

public class WordReversingProgram {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String x = "";
	while (!x.equalsIgnoreCase("quit")) {
		
		System.out.print("Enter a string: (Enter 'quit' to exit)\n");
		
		x = scan.next();
		if (!x.equalsIgnoreCase("quit")){ 
			System.out.print("Normal: " + x + " Reverse: " + reverse(x) + "\n\n");
		}
	}
	
	System.out.println("Thank you for using the Word Reversing Program!");
}
	
	public static String reverse(String a) {
		String newString;
		if (a.length() <= 1)
			return a;
		else
			newString = (reverse(a.substring(1)) + a.charAt(0));
		return newString;
	}

}
