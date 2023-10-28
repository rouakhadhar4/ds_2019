package ds_2019;

public class colis extends Courrier {
	private double poids;
	private double volume;
	colis(boolean mode_expédition,String adresse,double poids,double volume)
	{
		super(mode_expédition,adresse);
		this.poids=poids;
		this.volume=volume;
		
	}

@Override
public String toString() {
    return super.toString()+"le poids:  " +poids  +"en grammes "+"le volume:"+ volume + "en litres" ;
}
void decrire()
{
	System.out.println(toString());
}
double affranchir()
{
	double montant=0;
	montant = (0.25 *this.volume) + (this.poids * 1.0);
	return montant;
	
}

	
}