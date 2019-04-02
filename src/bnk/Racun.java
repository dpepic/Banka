package bnk;

import java.util.Vector;

public class Racun 
{
	static Vector<String> racuni = new Vector<String>();
	private double stanje;
	String idRacuna = null;
	
	public Racun(String r)
	{
		this.otvoriRacun(r);
	}
	
	public void otvoriRacun(String id)
	{
		if (this.idRacuna == null && !Racun.racuni.contains(id))
		{
			this.idRacuna = id;
			Racun.racuni.add(id);
		}
		else
			System.out.println("Racun vec postoji!");
	}
	
	public double depozit(double iznos)
	{
		if (this.idRacuna == null)
			return -1;
		
		this.stanje += iznos;
		return this.stanje;
	}
	
	public double isplata(double iznos)
	{
		if (this.idRacuna == null)
			return -1;
		
		if (this.stanje - iznos >= 0)
		{
			this.stanje -= iznos;
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

}
