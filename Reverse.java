/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	/**
	 * @param args
	 */
	public static void main (String[] args){
		
		String s = args[0];
		int n = s.length() - 1;
		int mid = n / 2;
		for (int i = n ; i >= 0 ; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("The middle character is " + s.charAt(mid));
	}
}
