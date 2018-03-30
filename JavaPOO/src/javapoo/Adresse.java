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
public class Adresse extends Personne {

    private String codePostal;
    private String ville;
    private String voie;

    public Adresse(String codePostal, String ville, String voie, String nom, String prenom) {
        super(nom, prenom);
        this.codePostal = codePostal;
        this.ville = ville;
        this.voie = voie;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

   

   

}
