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
	 
	 
	//Red�finition
	 public void a() 
	 {System.out.println("Fille_a"); }
	
	 //Red�finition
	 protected void b(FilleExo2 fille) {System.out.println("Fille_b(Fille)");}
	
	 //Red�finition
	 public void c(MereExo2 mere) {System.out.println("Fille_c(Mere)");}
	 
	 
	 //Surchage
	 void c(FilleExo2 b) {System.out.println("Fille_c(Fille)"); }
	
	 
	 //Red�finition
	 static void d() {System.out.println("static Fille_d");}
	 
	 //Surchage
	 static void d(MereExo2 mere) {System.out.println("Fille_d(Mere)");}
	
	 
	 //Red�finition
	 //Erreur car une m�thode d une sous classe ne peut pas ne pas �tre visible pour sa classe m�re
	 //private => visible uniquement dans la classe actuelle
	 //private void e() {System.out.println("Fille_e");};
	 
	 
	 //Red�finition
	 //protected => visible pour tous le package et les sous classe
	 protected void f() {System.out.println("Fille_f");}
	 
	  String g() {System.out.println("Fille_g"); return "c";}
	  
	  
	  //Erreur : Les m�thodes d'un objet ne peuvent pas �tre de type primitifs
	  //char h() {System.out.println("Fille_h"); return "c";}
	  //int i() {System.out.println("Fille_i"); return 3; }
	 
	 void j() throws IOException {System.out.println("Fille_j"); }
	 // Erreur : Quand on est dans une classe fille on doit mettre IOException et pas Exception
	 //void k() throws Exception {System.out.println("Fille_k"); }
	 
	 
	 
	 //Red�finition
	 void l() {System.out.println("Fille_l");}
	 
	 
	
	 //Red�finition
	  void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }
	  
	 
	 //Si on d�fini une classe Main, on doit le faire dans un autre fichier
	 //Sinon on peut juste  �crire public static void main --> Cela nous permet d'appeler la classe main sans l'instancier

	 public static void main(String[] args) throws Exception {
	  MereExo2 mere=new MereExo2();
	  MereExo2 mereFille=new FilleExo2();
	  FilleExo2 fille=new FilleExo2();
	 
	  
	  //Erreur : m�thode miage est une m�thode propre � la classe Fille
	  //mere.miage();
	  fille.miage();
	  
	//Erreur : m�thode miage est une m�thode propre � la classe Fille 
	  //Or l objet "mereFille" est de type "Mere"
	  //mereFille.miage();
	  
	  //Ici �a marche car on a fait un casting sur l obj "mereFille"
	  //Cast = Forcer le compilateur � consid�rer une variable comme �tant d un type!= du type d�clar�
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
	  
	  //Comme d() est static, on peut l appeler � partir du nom de sa classe (ie sans instancier un obj)
	  //mereFille.d();
	 
	  mere.printF();
	  mereFille.printF();
	 
	  mereFille.j();
	  mereFille.k();
	  mereFille.l();
	  mereFille.m();
	  }
	 }

	 
