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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaration d'une variable de type chat
        //et instantiation d'un nouveau chat
        Chat Tchala = new Chat();

        //définition des attributs de mon chat
        Tchala.setNom("Tchala");
        Tchala.setRace("wakanda");
        Tchala.setRobe("blackos");
        Tchala.setAnneeDeNaissance(2004);

        Tchala.miaou();

        Chat Felix = new Chat("Felix", "européenne", "blanc et noir", 2006);
        Felix.miaou();
        Chat.miaouuuu();

        //...24h de la vie d'un chat
        int heure = 0;
        while (heure <= 24) {
            Tchala.vivre();
            heure++;
            if (heure > 24) {
                break;
            }
        }
        System.out.println(Tchala);

        // Création d'une personne:
        Personne sam = new Personne("sufi", "sam");
        System.out.println(sam);
        
        // association d'une personne à un chat
        Tchala.setMaitre(sam);
        
        //définition des chats associés à la personne sam
        Chat[] chatDeSam = {Tchala, Felix};
        sam.setAnimaux(chatDeSam);
        System.out.println(sam);
        
        //création d'un client
        Client joe = new Client("00001", "Jackson", "joe");
        
      
        
   
        
        
        
        
        
     
        
    
    }//fin methode main

    //affichage des informations sur le chat
}//Fin de la classe Main

