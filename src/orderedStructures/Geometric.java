package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if(flag!=true) throw new IllegalStateException("fistValue has not been called");
		current = current * commonFactor; 
		return current;
	}
	public String toString(){
		return "Geom(3, 2) ";
		
	}
	
			public double getTerm(int n){
		return Math.pow(firstValue()*(commonFactor),(n-1));
		//t(n) = (first value) * (common factor)(n-1), 
	}
			public boolean equals(Object o){
				Geometric a = (Geometric) o;
				if((this.firstValue()==  a.firstValue())&& (this.commonFactor == a.commonFactor))
				return true;
				return false;
				
			}
}
