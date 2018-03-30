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
public class Chat {

    //...caractéristiques d'un chat
    private String nom;

    private String race;

    private String robe;

    private int anneeDeNaissance;
    
    private int faim  = 0;
    
    private int fatigue = 0;
    
    private int ennui = 0;
    
    private Personne maitre;
    
    
    //constructeur
    public Chat(){
        
    }//Fin constructeur vide

    //...constructeur
    public Chat(String nom, String race, String robe, int anneeDeNaissance) {
        this.nom = nom;
        this.race = race;
        this.robe = robe;
        this.anneeDeNaissance = anneeDeNaissance;
        
    }//Finconstructeur

    public Personne getMaitre() {
        return maitre;
    }

    public void setMaitre(Personne maitre) {
        this.maitre = maitre;
    }
    
    
    /**
     * methode pour modifier le nom du chat
     *
     * @param paramNom
     */
    public void setNom(String paramNom) {
        nom = paramNom;
    } //fin de methode setNom

    /**
     * methode pour obtenir le nom du chat
     *
     * @return
     */
    public String getNom() {
        return nom;

    }

    public String getRace() {
        return race;
    }//fin de methode getRace

    public void setRace(String race) {
        this.race = race;
    }//fin de methode setRace

    public String getRobe() {
        return robe;
    }//fin de methode getRobe

    public void setRobe(String robe) {
        this.robe = robe;
    }//fin de methode setRobe

    public int getAnneeDeNaissance() {
        return anneeDeNaissance;
    }//fin de methode getAnneeDeNaissance

    public void setAnneeDeNaissance(int anneeDeNaissance) {
        this.anneeDeNaissance = anneeDeNaissance;
    }//fin de methode setAnneeDeNaissance

    public void miaou() {
        System.out.println("Bonjour je m'appelle " + nom);
    }
    public static void miaouuuu() {
        
  
    }
     
       public void manger(){
            System.out.println("Je mange");
            faim--;
            ennui++;
            
        }//Fin methode manger
       
          public void dormir(){
            System.out.println("Je dors");
            fatigue--;
            faim++;
            
        }//Fin methode dormir
          
          public void jouer(){
            System.out.println("Je joue");
            fatigue++;
            faim++;
            ennui--;
            
        }//Fin methode jouer
          
          public void vivre(){
            System.out.println("Je joue");
            fatigue++;
            faim++;
            ennui--;
            
            
        if (faim == fatigue && fatigue == ennui){
          jouer();
          
        } else if ( faim > fatigue && faim > ennui){
           manger();
            
        }else if (fatigue > faim && fatigue > ennui ){
          dormir();  
         
        }else if (ennui > fatigue && ennui > faim ) {
            jouer();
            
        }else if (fatigue == faim ){
            manger();
            
        }else if (ennui == fatigue){
            dormir();
            
        }else if (ennui == faim ){
            manger();
        }//Fin serie conditions (if)
        
        
      
      }//Fin methode vivre

    @Override
    public String toString() {
        String infos = "Chat{" + "nom=" + nom + ", race=" + race + ", robe=" + robe + ", anneeDeNaissance=" + anneeDeNaissance + ", faim=" + faim + ", fatigue=" + fatigue + ", ennui=" + ennui + '}';
        infos += "mon Maitre est : " + maitre;
        return infos;
    }

    public boolean equals(Chat obj) {
        return nom == obj.nom;
    }
          
        
    
          
}//...Fin de Classe
