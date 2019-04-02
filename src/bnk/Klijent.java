package bnk;

import java.util.Vector;

public class Klijent 
{	
	Vector<Racun> racuni = new Vector<Racun>();
	String id;
	
	public Klijent(String id, String rac)
	{
		this.id = id;
		racuni.add(new Racun(rac));
	}
}
