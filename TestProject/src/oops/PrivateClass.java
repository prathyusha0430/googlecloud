package oops;

public class PrivateClass {
	
	private int pvar = 100;
	private int preturnvar() {
		return pvar;
	}
	public int preturnvarfun() {
		
		return preturnvar();
	}

}
