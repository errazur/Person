
public class Employee extends Person {
	
	private int salaire;
	
	public Employee() {
		
	}
	
	public Employee (String N, String P, int D, int S) {
		super (N,P,D);
		this.salaire=S;
	}
	
	//Methodes
	
	public void print() {
		super.print();
		System.out.print("\nLe salaire de la personne est : "+this.salaire);
	}
	
	//getter
	
	public int getsalaire(int S) {
		return this.salaire;
	}
	
	//setter
	
	public void setsalaire(int S) {
		this.salaire=S;
	}

	
	

}
