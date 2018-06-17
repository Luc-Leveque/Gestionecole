/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole;

/**
 *
 * @author luc
 */
public final class Enfant extends Personne {
    
    private int age;
    private String tuteur;
	
	public Enfant(){
		super ();
		this.age = 0;
		this.tuteur = "";
	}
        
        public Enfant(String nom,String prenom,int age,String tuteur, int id){
                super (nom , prenom , id);
		this.age = 0;
		this.tuteur = "";    
        }
	
	public int getAge(){
		return this.age;
	}
	
	public String getTuteur(){
		return this.tuteur;
	}
	
	public void setAge(int page){
		this.age = page;
	}
	
	public void setTuteur(String ptuteur){
		this.tuteur = ptuteur;
	}
	
	public void saisir(){
		super.saisir();
		System.out.println("Veuillez saisir l'age :");
		this.age = this.sc.nextInt();
		this.sc.nextLine();
		System.out.println("Veuillez saisir le tuteur :");
		this.tuteur = this.sc.nextLine();
	}
	
	public void afficher(){
		super.afficher();
		System.out.println("Age de l'enfant :"+this.age);
		System.out.println("Nom du tuteur :"+this.tuteur);
	}
	
	

    
}
