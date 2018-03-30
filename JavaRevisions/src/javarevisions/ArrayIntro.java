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
public class ArrayIntro {
    public static void main(String[] args) {
        // déclaration d'un tableau de chaines de caractères
        String[] students;
        //...initialisation du tableau
        students = new String[3];
        //...remplissage du tableau
        students[0] = "Max";
        students[1] = "Bernard";
        students[2] = "Elodie"; 
        System.out.println("Il y a " + students.length + " étudiants");
        System.out.println("Le premier se nomme " + students[0]);
        //...Tableau des notes des étudiants
        
        //...déclaration et initialisation de la liste des notes
        int notes[] = new int[3];
        notes[0] = 12;
        notes[1] = 5;
        notes[2] = 18;
        
        //...déclaration de variables pour le calcul de moyenne
        int sommeNotes=0; 
        int totNotes;
        int average;
        totNotes = students.length;     
        
        for (int i = 0; i<totNotes; i++){
            System.out.println(students[i] + "a obtenu la note " + notes[i]);
           
            //..calcul : moyenne des notes = somme des notes /nb de notes
            sommeNotes += notes[i]; 
        }
        
        average = sommeNotes / totNotes;
        System.out.println("la moyenne des notes des étudiant est " + average);
    }  
    
}
