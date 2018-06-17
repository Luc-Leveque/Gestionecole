/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole;
import java.util.Scanner;

/**
 *
 * @author luc
 */
public  final class Directeur extends Personne {
    
    private String directeur;
    private Scanner sc = new Scanner(System.in);
		
		public Directeur()
		{
			this.directeur= "" ;

		}
		public void saisir(){
                        super.saisir();
			System.out.println("Veuillez saisir le directeur de votre ecole  :");
			this.directeur = this.sc.nextLine();

                }
		public void afficher()
		{
			System.out.println("Votre directeur :"+this.directeur);
		}
                
	
	}
