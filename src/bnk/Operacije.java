package bnk;

public interface Operacije 
{
	public String otvoriRacun(String id);
	public String depozit(double iznos);
	public String isplata(double iznos);
	public String provera();
}
