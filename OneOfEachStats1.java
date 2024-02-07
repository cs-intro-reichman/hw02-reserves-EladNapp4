/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {

		int T = Integer.parseInt(args[0]);
		int numberOf2Children = 0;
        int numberOf3Children = 0;
		int numberOf4OrMoreChildren = 0;

		double sumNumberOfChildren = 0;

		for (int i = 0; i < T; i++) {
			boolean b = false;
		    boolean g = false;
		    int count = 0;
		    while (!(b && g)) {
			    double rnd = Math.random();
			    if (rnd < 0.5) {
				    b = true;
				    //System.out.print("b ");
			    } else {
				    g = true;
				    //System.out.print("g ");
			    }
			    count++;

			//System.out.println();
		    //System.out.println(count + " children.");
		    }

			sumNumberOfChildren = sumNumberOfChildren + count; 

			if (count == 2) {
				numberOf2Children++;
			} else {
			    if (count == 3) {
			    	numberOf3Children++;
			    } else {
			        numberOf4OrMoreChildren++;
			    }
			}
		}	
		


		double avreage = sumNumberOfChildren / T;
		
		System.out.println("Average: " + avreage + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + numberOf2Children);
		System.out.println("Number of families with 3 children: " + numberOf3Children);
		System.out.println("Number of families with 4 or more children: " + numberOf4OrMoreChildren);

		String mode = "The most common number of children is ";
		int max = Math.max(Math.max(numberOf2Children, numberOf3Children), numberOf4OrMoreChildren);
		if (max == numberOf2Children) {
			mode = mode + "2.";
		} else {
			if (max == numberOf3Children) {
				mode = mode + "3.";
			} else {
			    mode = mode + "4 or more.";
			}
		}
	     
	
		System.out.println(mode);
	}
}

