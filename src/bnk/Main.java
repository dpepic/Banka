package bnk;

import java.util.*;

public class Main 
{
	static Vector<Klijent> klijenti = new Vector<Klijent>();
	
	public static void main(String[] args) 
	{	
		klijenti.add(new Klijent("Pera", "r-001"));
		klijenti.get(0).racuni.add(new Racun("r-001"));
		klijenti.get(0).racuni.add(new Racun("r-001"));
		//klijenti.add(new Klijent("Neki", "r-001"));
		proveriRacune();
		
		klijenti.get(0).racuni.add(new DevizniRacun("d-001", "zklj", 1));
		Vector<Klijent> zaDbg = klijenti;
		/*klijenti.add(new Klijent("Pera", "r-001"));
		klijenti.add(new Klijent("Taj i taj", "r-001"));
		
		klijenti.get(0).racuni.add(new Racun("zklj"));
		klijenti.get(0).racuni.add(new Racun("r-001"));
		klijenti.get(1).racuni.add(new Racun("r-010"));
		proveriRacune();
		
		KlasaA test = new KlasaA();
		saKlasom(test);
		saIntom(test.intKaoStanje);
		test.intKaoStanje = 10;
		
		KlasaA test2 = new KlasaA();
		KlasaA test3 = new KlasaA();*/
		
	}
	
	public static void saKlasom(KlasaA nesto)
	{
		nesto.intKaoStanje++;
	}
	
	public static void saIntom(int broj)
	{
		broj++;
	}
	
	public static void proveriRacune()
	{
		for (Klijent k: klijenti)
		{
			System.out.println("Klijent: " + k.id);
			for (int i = 0; i < k.racuni.size(); i++)
			{
				if (k.racuni.get(i).idRacuna == null)
				{
					System.out.println(String.format("Klijent %s ima los racun!", k.id));
					k.racuni.remove(i);
					i--;
				}
			}
		}
	}

}
