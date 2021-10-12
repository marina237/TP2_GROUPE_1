package fr.dauphine.javaavance.td2;

public class Multiplication implements Expr{
	
	private Value value;
	private Expr add;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Multiplication(Value value, Expr add) {
		this.value = value;
		this.add = add;
	}

	
	@Override
	public double eval() {
		System.out.println("Multiplication en cours...");
		double res = this.value.getValeur()*this.add.getValeur();
		return res;
	}
	@Override
	public double getValeur() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
