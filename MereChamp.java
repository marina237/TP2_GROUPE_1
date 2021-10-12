package fr.dauphine.javaavance.td2;

class MereChamp {
	protected int meth=42;
	public void printMeth() {
	System.out.println(meth);
}
}
class FilleChamp extends MereChamp {
	public int meth = 24;
}
class Main {
	public static void main(String[] args) {
		MereChamp mere = new MereChamp();
		System.out.println(mere.meth);
		mere.printMeth();
		FilleChamp fille = new FilleChamp();
		System.out.println(fille.meth);
		fille.printMeth();
		MereChamp mereFille = new FilleChamp();
		System.out.println(mereFille.meth);
		mereFille.printMeth();
}
}
