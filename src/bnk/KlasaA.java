package bnk;

public class KlasaA 
{
	public static int brojac = 1; //0,1,2,3
	public final int rbr = brojac;
	
	public int intKaoStanje = 5;
	public final int neki = uvecajStanje();
	KlasaB drugiObjekat = new KlasaB();
	
	int uvecajStanje()
	{
		return this.intKaoStanje*2;
	}
	
	public KlasaA()
	{
		KlasaA.brojac++;
	}
}
