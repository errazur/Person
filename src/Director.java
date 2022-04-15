
public class Director extends Chief {
	
	private String company;
	
	public Director() {
		
	}
	
	public Director(String N, String P, int D, int S, String C,String K) {
		super (N,P,D,S,C);
		this.company=K;
	}
	
	//Methodes
	
	public void print() {
		super.print();
		System.out.print("\nLa societe se nomme : "+this.company);
	}
	
	//getter 
	
	public String getcompany(String S) {
		return company;
	}
	
	//setter
	
	public void setcompany(String S) {
		this.company=S;
	}

}
