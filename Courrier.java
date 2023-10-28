package ds_2019;

public class Courrier {
	protected boolean mode_expédition;
	protected String adresse;
	protected final double tarif=0.5;
	Courrier(boolean  mode_expédition,String adresse)
	{
		this.adresse=adresse;
		this.mode_expédition=true;
	}
	
	boolean estValide()
	{
		if((this.adresse!=null)&&(!this.adresse.isEmpty()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
    public String toString() {
        return this.getClass().getSimpleName()+"le mode d'expedition du courrier:  " +mode_expédition  + " d'adresse " + adresse ;
    }
	void decrire()
	{
		System.out.println(toString());
	}
	double affranchir()
	{
		double montant=0;
		if(estValide())
		{
			if(this.mode_expédition==false)
				 montant=this.tarif;
			else 
				 montant=(2*this.tarif);
		}
		else
		{
		       montant=0;
		}
		return montant;
		
	}
	
	

}
