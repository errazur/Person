
public class Chief extends Employee {
	
	private String service;
	
	public Chief() {
		
	}
	
	public Chief(String N, String P, int D, int S, String C) {
		super (N,P,D,S);
		this.service=C;
	}
	
	//Methodes
	
	public void print() {
		super.print();
		System.out.print("\nLe service de la personne est : "+this.service);
	}
	
	//getter
	
	public String getservice (String S) {
		return this.service;
	}
	
	//setter
	
	public void setservice (String S) {
		this.service=S;
	}

}
