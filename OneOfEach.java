
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		boolean b = false;
		boolean g = false;
		int count = 0;
		
		while (!(b && g)) {
			double rand = Math.random();
			if (rand < 0.5) {
				b = true;
				System.out.print("b ");
			} else {
				g = true;
				System.out.print("g ");
			}
			count++;
		}
		
		System.out.println();
		System.out.println("You made it... and you now have " + count + " children.");
	}
}
