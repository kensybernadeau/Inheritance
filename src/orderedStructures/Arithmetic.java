package orderedStructures;

import java.util.ArrayList;

public class Arithmetic extends Progression  {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if(flag!=true) throw new IllegalStateException("fistValue has not been called");
		current = current + commonDifference; 
		return current;
	}
public String toString(){
	return "Arith(3, 2) ";
	
}
public double getTerm(int n){
	return (firstValue() + (commonDifference*(n-1)));
	//t(n) = (first value) + (common difference)*(n-1).
}
public boolean equals(Object o){
	Arithmetic a = (Arithmetic) o;
	if((this.firstValue()==  a.firstValue())&& ((this.commonDifference == (a.getTerm(1)-a.getTerm(0))) &&
			(this.commonDifference == (a.getTerm(2)-a.getTerm(1)))))
	return true;
	return false;
	
}



}
