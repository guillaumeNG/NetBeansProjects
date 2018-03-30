/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevisions;

/**
 *
 * @author Guillaume N.
 */
public class FonctionIntro {

    public static void main(String[] args) {
        //...autre solution avec un tableau
        String[] names = {"Albert", "Cunegone", "Albrecht", "Thorsten"};
        for (String name : names) {
            hello(name, 15);
        }
        hello("sophie", 18);
        hello("kitty", 25);
        System.out.println("100 euros HT = " + getTTC(100, 0.2));
        double prix = getTTC(250, 0.07);
        System.out.println("prix");

    }//finde methode main

    /**
     * fonction qui affiche hello world dans la console
     *
     * @param name : String : le nom de la personne
     * @param age : String : l'âge de la personne
     */
    public static void hello(String name, int age) {
        System.out.println("Hello " + name + " vous avez " + age + "ans");
    }//...Fin de la methode hello()

    public static double getTTC(double montantHT, double tauxTVA) {
        double montantTTC = montantHT * (1 + tauxTVA);
        return montantTTC;
    }

}//...Fin classe

