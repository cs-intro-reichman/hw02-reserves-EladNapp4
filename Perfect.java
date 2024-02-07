/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int perf = Integer.parseInt(args[0]);
		String oPut = perf + " is a perfect number since " + perf + " = 1";
		int sum = 1;

		for (int i = 2 ; i < perf ; i++) {
			if (perf % i == 0) {
				oPut = oPut + " + " + i;
				sum = sum + i;
			}
		}

		if (perf != sum) {
			oPut = (perf + " is not perfect number");
		}

		System.out.println(oPut);
	}
}
