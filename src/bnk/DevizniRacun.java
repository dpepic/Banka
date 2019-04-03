package bnk;

public class DevizniRacun extends Racun
{
	public DevizniRacun(String id, devize d, double k)
	{
		super(id);	
		this.valuta = d;
		this.kurs = k;
	}
	
	public String pretvoriUdomace(double iznos, Racun domaci)
	{
		if (this.stanje - iznos < 0)
			return null;
		
		this.stanje -= iznos;
		domaci.stanje += iznos / this.kurs;
		return this.stanje + " " + this.valuta.name();
	}
}
