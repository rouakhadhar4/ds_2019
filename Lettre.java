package ds_2019;

public class Lettre extends Courrier {
	private double poids;
	private String format;
	Lettre(boolean  mode_expédition,String adresse,double poids,String format)
	{
		super(mode_expédition,adresse);
		this.poids=poids;
		if(format.toUpperCase().equals("A3")||format.toUpperCase()=="A4")
		        this.format=format;
		else
		{
			System.out.println("c'est faux");
			this.format="A3";
			
		}
		
	}
	
	

	@Override
	public String toString() {
	    return super.toString()+"le poids:  " +poids  +"en grammes "+"Son format:"+ format ;
	}
	void decrire()
	{
		System.out.println(toString());
	}
	double affranchir()
	{
		double montant=0;
		
		if(this.format=="A3")
		{
			montant = 3.5 + 0.5 * this.poids;
		}
	
		if(this.format=="A4")
			{
			  montant = 2.5 + 0.5 * this.poids;
			
			}
		if(super.mode_expédition==true)
		{
			montant=2*montant;
		}
		
		
		return montant;
		
			
	}
	
}


