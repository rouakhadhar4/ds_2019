package ds_2019;


public class test {

	public static void main(String[] args) {
		Boite_Courrier B =new Boite_Courrier(3);
		
		Courrier c=new Courrier(true,"nabeul");
		Lettre L=new Lettre(false,"",10.8,"A4");
		colis c1=new colis(true,"",20.9,19.0);
		B.tab[0]=c;
		B.tab[1]=L;
		B.tab[2]=c1;
		
		
		
		B.afficher();
		System.out.println("le montant totale des courriers: "+String.format("%.3f",B.affranchir()));
		System.out.println("le nb de courriers invalide: "+B.courriersInvalides());
		
	
			 
			
		
		
		
	  
		
		
		
		
	    

	}

}
