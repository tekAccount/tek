package homayonjan;

import java.util.ArrayList;

public class Fibnachinumbers {

	public static void main(String[] args) {
	
		int count = 15;
		
		// 0 1 1 2 3 
		
		// creating a list to keep the fib numbers
		
		ArrayList<Integer> fibNums = new ArrayList<Integer> ();
		// adding the first two values in the list 
		fibNums. add (0);
		fibNums.add(1);
		for ( int i = 0;i < count-2;i ++) {
			// getting the two previous indexes and adding them
			int sum = fibNums.get(i) + fibNums.get (i+1);
			// adding the new fib num to the list
			fibNums.add(sum);
		}
		
		// printing the list of fib numbers
		System.out.println(fibNums);
	}

}
