package fr.dauphine.javaavance.td2;

public class Mere {
	
	
	protected static int meth() {
		return 42;
		}

	
	
		public void printMeth() {
		System.out.println(meth());
		}
		}
		class Fille extends Mere {
		
		public static int meth() {
		return 24;
		
		
		
		}
	
	/**
	 * Description m�thode main
	 * @param args
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Mere mere = new Mere();
			System.out.println(Mere.meth());
			//mere.printMeth();
			Fille fille = new Fille();
			
			//On ne peut plus acc�der � la m�thode meth() avec l 'objet fille
			//Static --> Appel m�thode en utilisant directement la classe Fille
			
			//System.out.println(fille.meth());
			
			
			System.out.println(Fille.meth());
			
			//fille.printMeth();
			
		
		
			
//			
//			Mere mereFille = new Fille();
//			System.out.println(mereFille.meth());
//			mereFille.printMeth();

	}

}
