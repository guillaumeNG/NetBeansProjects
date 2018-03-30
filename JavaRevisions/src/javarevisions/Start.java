/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevisions;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //...déclaration d'une variable
        int age;
       // ...Affectation d'une valeur à une variable
       age = 10;
       
       char sex = 'm';  
       
       float wage = 100.8f;
       
       // ...déclaration et affectation d'une variable
       String name = "Guillaume";
       
       //...instantiation de la classe Scanner qui va lire
       //...la saisie de la console
        Scanner sc = new Scanner (System.in);
        //...lecture de la prochaine saisie de l'utilisateur
        System.out.println("Veuillez entrer votre nom ici");
        name = sc.next();
       
       
 
        System.out.println("Hello");
        System.out.println("Hello " + name + " vous avez " + age + " ans");
        String majorite;
        String accord = sex =='f'?"e":"";
        
        /*
         *définition du message
         * en fonction de l'âge
        */
        if(age<18){
            majorite = "vous êtes mineur" + accord;
      }else{
            majorite = "vous êtes majeur" + accord;  
        }
            System.out.println( majorite);   
    }
    
}
