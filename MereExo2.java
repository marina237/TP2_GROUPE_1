package fr.dauphine.javaavance.td2;

import java.io.IOException;

class MereExo2
{
	 public void a() 
	 {System.out.println("Mere_a"); }
	 void b(FilleExo2 fille) {System.out.println("Mere_b(Fille)");}
	
	void c() {System.out.println("Mere_c");}
	
	//Surchage
	void c(MereExo2 mere) {System.out.println("Mere_c(Mere)"); }
	
	static void d() {System.out.println("static Mere_d");}
	
	 protected void e() {System.out.println("Mere_e");}
	 private void f() {System.out.println("Mere_f");}
	 public void printF() { f(); }
	
	 Object g() {System.out.println("Mere_g"); return 2;}
	 int h() {System.out.println("Mere_h"); return 2;}
	 void i() {System.out.println("Mere_i");}
	
	 void j() throws Exception 
	 {System.out.println("Mere_j"); }
	 void k() throws IOException {System.out.println("Mere_k"); }
	 void l() throws Exception {System.out.println("Mere_l"); }
	 void m() throws Exception, ArrayIndexOutOfBoundsException {System.out.println("Mere_m"); }
	 }




	 class FilleExo2 extends MereExo2{
		 
	 
	 void miage() 
	 {System.out.println("Miage");}
	 
	 
	//Redéfinition
	 public void a() 
	 {System.out.println("Fille_a"); }
	
	 //Redéfinition
	 protected void b(FilleExo2 fille) {System.out.println("Fille_b(Fille)");}
	
	 //Redéfinition
	 public void c(MereExo2 mere) {System.out.println("Fille_c(Mere)");}
	 
	 
	 //Surchage
	 void c(FilleExo2 b) {System.out.println("Fille_c(Fille)"); }
	
	 
	 //Redéfinition
	 static void d() {System.out.println("static Fille_d");}
	 
	 //Surchage
	 static void d(MereExo2 mere) {System.out.println("Fille_d(Mere)");}
	
	 
	 //Redéfinition
	 //Erreur car une méthode d une sous classe ne peut pas ne pas être visible pour sa classe mère
	 //private => visible uniquement dans la classe actuelle
	 //private void e() {System.out.println("Fille_e");};
	 
	 
	 //Redéfinition
	 //protected => visible pour tous le package et les sous classe
	 protected void f() {System.out.println("Fille_f");}
	 
	  String g() {System.out.println("Fille_g"); return "c";}
	  
	  
	  //Erreur : Les méthodes d'un objet ne peuvent pas être de type primitifs
	  //char h() {System.out.println("Fille_h"); return "c";}
	  //int i() {System.out.println("Fille_i"); return 3; }
	 
	 void j() throws IOException {System.out.println("Fille_j"); }
	 // Erreur : Quand on est dans une classe fille on doit mettre IOException et pas Exception
	 //void k() throws Exception {System.out.println("Fille_k"); }
	 
	 
	 
	 //Redéfinition
	 void l() {System.out.println("Fille_l");}
	 
	 
	
	 //Redéfinition
	  void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }
	  
	 
	 //Si on défini une classe Main, on doit le faire dans un autre fichier
	 //Sinon on peut juste  écrire public static void main --> Cela nous permet d'appeler la classe main sans l'instancier

	 public static void main(String[] args) throws Exception {
	  MereExo2 mere=new MereExo2();
	  MereExo2 mereFille=new FilleExo2();
	  FilleExo2 fille=new FilleExo2();
	 
	  
	  //Erreur : méthode miage est une méthode propre à la classe Fille
	  //mere.miage();
	  fille.miage();
	  
	//Erreur : méthode miage est une méthode propre à la classe Fille 
	  //Or l objet "mereFille" est de type "Mere"
	  //mereFille.miage();
	  
	  //Ici ça marche car on a fait un casting sur l obj "mereFille"
	  //Cast = Forcer le compilateur à considérer une variable comme étant d un type!= du type déclaré
	  ((FilleExo2)mereFille).miage();
	 
	  mere.a();
	  mereFille.a();
	 
	  
	  
	  fille.a();
	  ((MereExo2)mereFille).a();
	  mereFille.b(null);
	 
	  mereFille.c();
	  mereFille.c(mere);
	  mereFille.c(mereFille);
	  mereFille.c(fille);
	  fille.c(fille);
	 
	  MereExo2.d();
	  
	  //Comme d() est static, on peut l appeler à partir du nom de sa classe (ie sans instancier un obj)
	  //mereFille.d();
	 
	  mere.printF();
	  mereFille.printF();
	 
	  mereFille.j();
	  mereFille.k();
	  mereFille.l();
	  mereFille.m();
	  }
	 }

	 
