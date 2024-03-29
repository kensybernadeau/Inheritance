package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester2 {

	public static void main(String[] args) { 
		Progression p = new Arithmetic(3, 2); 
		// outputs the sum of first 5 terms in p
		printSumOfTerms(p, 5); 

		p = new Geometric(3, 2); 
		printSumOfTerms(p, 5); 
	} 

	/** Prints the sum of the first terms in a 
	    	      progression. 
			@param p the progression
			@param n the number of terms to consider
	 **/ 
	private static void printSumOfTerms(
			Progression p, int n) 
	{ 
		double sum=p.firstValue();
		//double sum=p.firstValue(); uncomment and comment line above to text ex.6
		for(int k=1;k<n;k++){
			sum+=p.nextValue();
		}
		    
		System.out.println("Sum of first " + n + " terms in " 
				+ p + " is: " + sum); 
	}


}
