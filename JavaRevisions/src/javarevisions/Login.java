/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevisions;

/**
 *
 * @author Administrateur
 */
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        
        //...déclaration des variables
        String userName;
        String mdp;
        
        //...instantiation de la classe Scanner qui va lire
        //...la saisie de la console
        Scanner sc = new Scanner(System.in);
        
        userName = inputUserName(sc);
        mdp = inputPassword(sc);
        
        checkLogin(userName, mdp);
    }

    public static String inputPassword(Scanner sc) {
        String mdp;
        System.out.println("Veuillez entrer votre mdp ici");
        mdp = sc.next();
        return mdp;
    }

    public static String inputUserName(Scanner sc) {
        String userName;
        //...affectation des valeurs en fonction de la saisie de l'utilisateur
        System.out.println("Veuillez entrer votre login ici");
        userName= sc.next();
        return userName;
    }

    public static void checkLogin(String userName, String mdp) {
        //...equals permet de tester l'égalisté entre une String et une classe
        //...Test de l'authntification
        if (userName.equals("user")  && mdp.equals ("123")) {
            System.out.println("ok");
        } else {
            System.out.println("ko");
        }
    }
}
