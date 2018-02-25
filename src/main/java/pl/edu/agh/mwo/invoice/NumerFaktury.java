package pl.edu.agh.mwo.invoice;

public class NumerFaktury {
public static int numer;


public static int generujNumer(){
	numer += 1;
	return numer;
}
}
