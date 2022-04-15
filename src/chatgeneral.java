
public class chatgeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] tab= new Person[10];
		
		tab[0]= new Employee("Cartier","Jack",14061989,1258);
		tab[1]= new Employee("Pierre","Alexis",12122001,1356);
		tab[2]= new Chief("Valtery","Romain",6021994,2001,"Livraison");
		tab[3]= new Chief("Kyle","Paul",2011969,2104,"Gestion");
		tab[4]= new Director("Stark","Tony",29051970,1000000,"PDG","Stark industries");
		tab[5]= new Employee("Cartier","Jack",14061989,1258);
		tab[6]= new Employee("Cartier","Jack",14061989,1258);
		tab[7]= new Employee("Cartier","Jack",14061989,1258);
		tab[8]= new Employee("Cartier","Jack",14061989,1258);
		tab[9]= new Employee("Cartier","Jack",14061989,1258);
		
		
		for(int i=0;i<10;i++) {
			tab[i].print();
			System.out.println();
		}
		
		
		
		
		
		

	}

}
