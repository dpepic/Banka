package bnk;

import java.util.Vector;

public class Racun 
{
	static Vector<String> racuni = new Vector<String>();
	double stanje;
	final String idRacuna;
	devize valuta = devize.RSD;
	double kurs = 1;
	
	public Racun(String r)
	{
		this.idRacuna = otvoriRacun(r); //samo ovde
		               //mozemo da dodelimo vrednost za
		              //final
	}
	
	public String otvoriRacun(String id)
	{
		if (!Racun.racuni.contains(id))
		{
			Racun.racuni.add(id);
			return id;
		}
		else
		{
			System.out.println("Racun vec postoji!");
			return null;
		}
	}
	
	public double depozit(double iznos)
	{
		if (this.idRacuna == null)
			return -1;
		
		this.stanje += iznos * this.kurs;
		return this.stanje;
	}
	
	public double isplata(double iznos)
	{
		if (this.idRacuna == null)
			return -1;
		
		if (this.stanje - iznos * this.kurs >= 0)
		{
			this.stanje -= iznos * this.kurs;
			return this.stanje;
		} else
		{
			System.out.println("Premalo kesa!");
			return this.stanje;
		}
	}
	
	public double provera()
	{
		if (this.idRacuna == null)
			return -1;
		
		return this.stanje;
	}
	
	enum devize
	{
		RSD,
		EUR,
		BAM,
		USD,
		GBP
	}
}


