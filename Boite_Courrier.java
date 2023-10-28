package ds_2019;

public class Boite_Courrier {
	
		
		 Courrier tab[];

		 Boite_Courrier(int n)
		{
			 tab=new Courrier[n];
			
		}
		 public double affranchir()
		 {
			 
		
		 double montant=0;
			
			for (int i = 0; i < tab.length; i++) {
				
				montant+=tab[i].affranchir();
		
			}
			
			
			return montant;
			
		 }
		 
		public int courriersInvalides()
		{
			int nb=0;
			
		 for (int i = 0; i < tab.length; i++) {
		
			if(tab[i].estValide()==false)
				nb++;
		}
		
		return nb;
		}
		public void afficher()
		{
			for (int i = 0; i < tab.length; i++) {
			
				tab[i].decrire();
				if(tab[i].estValide()==false)
					System.out.println("ce courrier est invalide");
				else
					
					System.out.println("ce courrier est valide");
				
					
	    }
		}
		

		
		
		
		
	}
		
		
		
        
		

	





