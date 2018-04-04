/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.m2i.imcapp;

import fr.m2i.imc.model.ImcCalculator;
import java.util.Scanner;



/**
 *
 * @author Administrateur
 */
public class MainImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // interface utilisateur pour le calcul de l'imc
        
        //déclaration des variables dont pon a besoin
        double poids, taille;
        Scanner saisie = null;
        ImcCalculator calculateurIMC;
        
        //instanciation du scanner
        saisie = new Scanner(System.in);
        System.out.println("vous voulez calculez votre IMC ");
        
        System.out.println("saisissez votre taille en mètres");
        taille = saisie.nextDouble(); //convertit la prochaine saisie en type Double
        
        System.out.println("saisissez votre masse en kg");
        poids = saisie.nextDouble();
        
        //instanciation du calculateur d'IMC avec la siasie de l'utilisateur
        calculateurIMC = new ImcCalculator(poids, taille);
        
        //Affiche du resultat 
        System.out.println("votre IMC est : " + calculateurIMC.getImc());
        System.out.println(calculateurIMC.traduireImc());
    }
    
}
