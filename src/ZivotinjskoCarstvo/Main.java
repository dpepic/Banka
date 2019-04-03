package ZivotinjskoCarstvo;

import java.util.Vector;

public class Main {

	public static void main(String[] args) 
	{
		Vrabac pera = new Vrabac();
		Vrabac maleni = new Vrabac();
		Gavran crni = new Gavran();
		Macka macaX = new Macka();
		crni.radiPreinteligenteStvari();
		System.out.println(pera.oglasiSe());
		System.out.println(macaX.oglasiSe());
		System.out.println(crni.oglasiSe());
		
		Vector<Vrabac> sviV = new Vector<Vrabac>();
		for (int i = 0; i < 20; i++)
			sviV.add(new Vrabac());
		
		for(Vrabac v: sviV) {}
			//System.out.println(v.oglasiSe());
		
		Vector<Gavran> sviG = new Vector<Gavran>();
		for (int i = 0; i < 5; i++)
			sviG.add(new Gavran());
		
		for(Gavran g: sviG) 
		{
			g.radiPreinteligenteStvari();
		}
			//System.out.println(g.oglasiSe());
		
		Vector<Ptica> svePtice = new Vector<Ptica>();
		for (int i = 0; i < 20; i++)
			svePtice.add(new Vrabac());
		for (int i = 0; i < 5; i++)
			svePtice.add(new Gavran());
		
		for (Ptica p: svePtice)
		{
			System.out.println(p.oglasiSe());
			p.leti();
		}
		
		Vector<Macka> sveMacke = new Vector<Macka>();
		for (int i = 0; i < 50; i++)
			sveMacke.add(new Macka());
		
		for (Macka maca: sveMacke)
			System.out.println(maca.oglasiSe());
		
		Vector<Zivuljke> sveZivuljke = new Vector<Zivuljke>();
		sveZivuljke.add(crni);
		sveZivuljke.add(maleni);
		sveZivuljke.add(macaX);
		
		for (Zivuljke z: sveZivuljke)
			System.out.println("Iz vektora za sve:) : " + z.oglasiSe());

	}

}
