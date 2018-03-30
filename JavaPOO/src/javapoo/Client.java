/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

/**
 *
 * @author Guillaume N.
 */
public class Client extends Personne {

    private String numClient;
    private CompteBancaire compteBancaire;
    private Banque banque; 
     
    

    public Client(String numClient, String nom, String prenom) {
        super(nom, prenom);
        this.numClient = numClient;
    }

    
    // Getters et setters
    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public CompteBancaire getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(CompteBancaire compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

   
    @Override

    public String toString() {

        // appel de la methode toString du parent: Personne
        String infos = super.toString();

        //Ajout des infos spécifiques au client 
        infos += " \n mon numero client: " + numClient;
        return infos;

//        // appel de la methode toString du parent: Personne
//        String infos = super.toString();
//
//        //Ajout des infos spécifiques au client 
//        infos += " \n mon numero de compte bancaire : " + compteBancaire;
//        return infos;

    }//Fin de toString  
        
  
   
   
   
}//Fin classe Client

