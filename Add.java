package fr.dauphine.javaavance.td2;


public class Add implements Expr{
	private Value  valeur1;
	private Expr  valeur2;

	public Add(Value val1, Expr val2) {
		this.valeur1 = val1;
		this.valeur2 = val2;
	}
	
	public double eval() {
		double res = this.valeur1.getValeur()+this.valeur2.getValeur(); 
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getValeur() {
		// TODO Auto-generated method stub
		return this.eval();
	}
	

}