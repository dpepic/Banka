package bnk;

import java.util.Vector;

public class Main 
{
	public static void main(String[] args) 
	{	
		int x = 5;
		int y = x;
		int[] niz = new int[5];
		
		for (int i = 0; i < 5; i++)
			niz[i] = i+1; //1, 2, 3, 4, 5
		
		int[] niz3 = niz; //Obe pokazuju na isti!!
		int[] niz2 = new int[niz.length];
		for (int i = 0; i < niz2.length; i++)
			niz2[i] = niz[i];
		
		niz[1] = 5;
		System.out.println("Niz pre f: " + niz[1]);
		System.out.println("X pre f: " + x);
		nekaFunkcija(x);
		nfn(niz);
		System.out.println("Niz posle f: " + niz[1]);
		System.out.println("X posle f: " + x);
		
		Klijent Test = new Klijent("Test", "r98");
		Klijent[] nizK = new Klijent[5];
		nizK[1] = Test;
		System.out.println("Pre poziva: " + Test.id);
		nekaDrugaFunkcija(Test);
		System.out.println(Test.id);
		
		Klijent test2 = vracaObjekat(Test);
		System.out.println(test2.toString());
		System.out.println(Test.toString());
		
		Klijent Pera = new Klijent("Pera", "r001");
		System.out.println("Pera je: " + Pera.toString());
		Vector<Klijent> vektor = new Vector<Klijent>();
		vektor.add(Pera);
		Klijent Drugi = new Klijent("Drugi", "r003");
		
		if (Pera.equals(Drugi))
			System.out.println("Isti su????");
		if (Pera == Drugi)
			System.out.println("Isti su?????");
		
		int[] nizuMain = {1, 2, 3};
		int[] nizRez = kopirajNiz(nizuMain);
		nizRez[1]++;
		String nekiString = "asd";
		stringF(nekiString);
		System.out.println(nekiString);
		
		
	}
	
	static void stringF(String txt)
	{
		txt = "pauzaaaaaaaaaaaaaaa";
	}
	
	static int[] kopirajNiz(int[] niz)
	{
		int[] noviNiz = new int[niz.length];
		for (int i = 0; i < niz.length; i++)
			noviNiz[i] = niz[i];
		return noviNiz;
	}
	
	static void nekaFunkcija(int x)
	{
		x++;
	}
	
	static void nfn(int[] niz)
	{
		niz[1]++;
	}
	
	static void nekaDrugaFunkcija(Klijent Pera)
	{
		Pera.id = "Nesto peto";
	}
	
	static Klijent vracaObjekat(Klijent Pera)
	{
		
		Pera.id = "asdasd";
		return Pera;
	}
}
