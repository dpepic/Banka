package bnk;

public class DevizniRacun extends Racun
{
	public DevizniRacun(String id, String v, double k)
	{
		super(id);	
		this.valuta = devize.valueOf(v);
		this.kurs = k;
	}
}
