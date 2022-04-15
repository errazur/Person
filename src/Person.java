
public class Person {
	
	private String nom;
	private String prenom;
	private int Date;
	
	public Person() {
		
	}
	
	public Person (String N, String P, int S) {
		nom=N;
		prenom=P;
		Date=S;
	}
	
	// methodes
	
	public void print() {
		System.out.print("\nle nom de la personne est : "+this.nom +"\nle prenom de la personne est : "+this.prenom +"\nla date de naissance de la personne est : "+this.Date);
	}
	
	//getter
	
	public String getnom(String S) {
		return nom;
	}
	
	public String getprenom(String S) {
		return prenom;
	}
	
	public int getdate(int S) {
		return Date;
	}
	
	//setter
	
	public void setnom(String S) {
		nom=S;
	}
	
	public void setprenom(String S) {
		prenom=S;
	}
	
	public void setdate(int S) {
		S=Date;
	}

}
