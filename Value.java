package fr.dauphine.javaavance.td2;

public class Value implements Expr {
	
	private double valeur;

	
	public Value(double val) {
		this.valeur = val;
	}
	
	public double eval() {
		return this.valeur;
	}
	public double getValeur() {
		return valeur;
	}

}	