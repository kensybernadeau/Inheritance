package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
		if(flag!=true) throw new IllegalStateException("fistValue has not been called");
        // add the necessary code here
		
		double next = prev + current;
	     prev=current;
	     current=next;

		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}
	
	public boolean equals(Object o){
		Fibonacci f = (Fibonacci) o;
		if(this.firstValue()== f.firstValue())
			return true;
		return false;
		
	}

}
