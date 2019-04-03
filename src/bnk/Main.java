package bnk;

import java.util.*;

public class Main 
{
	static Vector<Klijent> klijenti = new Vector<Klijent>();
	
	public static void main(String[] args) 
	{	
		Vector<Klijent> zaDbg = Main.klijenti;
		klijenti.add(new Klijent("Pera", "r-001"));
		klijenti.get(0).racuni.add(new DevizniRacun("d-001", Racun.devize.EUR, 0.5));
		System.out.println(klijenti.get(0).racuni.get(0).depozit(500));
		System.out.println("Provera stanja: " + klijenti.get(0).racuni.get(0).provera());
		System.out.println(klijenti.get(0).racuni.get(1).depozit(500));
		((DevizniRacun)klijenti.get(0).racuni.get(1)).pretvoriUdomace(100, klijenti.get(0).racuni.get(0));
		
		Racun test = new Racun("neki-995");
		SpecificanRacun sRac = new SpecificanRacun();
		Operacije ovoJeInterfejs = test;
		Operacije InterfejsJej = sRac;
		
		
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
