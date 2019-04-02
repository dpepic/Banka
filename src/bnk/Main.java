package bnk;

import java.util.*;

public class Main 
{
	static Vector<Klijent> klijenti = new Vector<Klijent>();
	
	public static void main(String[] args) 
	{	
		klijenti.add(new Klijent("Pera", "r-001"));
		klijenti.add(new Klijent("Taj i taj", "r-001"));
		
		klijenti.get(0).racuni.add(new Racun("zklj"));
		klijenti.get(0).racuni.add(new Racun("r-001"));
		klijenti.get(1).racuni.add(new Racun("r-010"));
		proveriRacune();
	}
	
	public static void proveriRacune()
	{
		for (Klijent k: klijenti)
		{
			for (Racun r: k.racuni)
			{
				if (r.idRacuna == null) //"null" -- null
					System.out.println(String.format("Klijent %s ima los racun!", k.id));
			}
		}
	}

}
