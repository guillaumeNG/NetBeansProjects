/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.m2i.imc.model;

/**
 *
 * @author Administrateur
 */
public class ImcCalculator {

    private double poids;
    private double taille;
    private Double imc;

    //constructeur
    public ImcCalculator(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
        //calcul de l'imc à l'instantiation de l'objet
        calculerImc();
    }//fin constructeur

    //getters & setters
    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
        calculerImc();
    }//si le poids change il faut recalculer l'imc

    public double getTaille() {
        return taille;

    }

    public void setTaille(double taille) {
        this.taille = taille;
        calculerImc();
    }//si la taille change il faut recalculer l'imc

    public double getImc() {
        return imc;
    }

    //methode de calcul de l'imc
    private void calculerImc() {
        imc = poids / (taille * taille);
    }//Fin de methode 

    public String traduireImc() {
        String message;

        if (imc < 16.5) {
            message = "anorexique";

        } else if (imc > 16.5 && imc < 18.5) {
            message = "maigre";

        } else if (imc > 18.5 && imc < 25) {
            message = "corpulance normale";

        } else if (imc > 25 && imc < 30) {
            message = "surpoids";

        } else if (imc > 30 && imc < 35) {
            message = "obésité modérée";

        } else if (imc > 35 && imc < 40) {
            message = "obésité sévère";
        } else {
            message = "obésité morbide";
        }

        return message;
    }
}//Fin classe imcCalculator
