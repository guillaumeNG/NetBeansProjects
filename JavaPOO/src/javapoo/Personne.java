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
public class Personne {

    private String nom;
    private String prenom;
    private Chat[] animaux;
    private Adresse adresse;
   

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
   

 

    public String getNom() {
        return nom;
    }

    /**
     * methode pour modifier le prenom d'une personne
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * methode pour obtenir le prenom d'une personne
     */
    public String getPrenom() {

        return prenom;

    }

    /**
     * methode pour obtenir la liste des chats d'une personne
     */
    public Chat[] getAnimaux() {
        return animaux;
    }

    /**
     * methode pour modifier la liste des chats d'une personne
     */
    public void setAnimaux(Chat[] animaux) {
        this.animaux = animaux;
    }

    /**
     * methode pour obtenir l'adresse d'une personne
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * methode pour modifier l'adresse d'une personne
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    

    @Override
    public String toString() {
        String infos = "je suis " + prenom + " " + nom;
        infos += " \n voici mes Chats :\n ";

        if (animaux != null) {
            for (Chat chat : animaux) { // pour chaque chat dans animaux
                infos += chat.getNom() + "\n";
            }
        }
        return infos;

    }//Fin methode toString
}//Fin caractéristiques de personne

