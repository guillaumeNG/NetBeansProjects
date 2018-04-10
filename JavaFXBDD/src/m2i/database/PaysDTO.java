package m2i.database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrateur
 */
public class PaysDTO {
    private String nom;
    private Integer id;

    public PaysDTO() {
    }

    public PaysDTO(String name) {
        this.nom = nom;
    }

    public PaysDTO(String nom , Integer id){
        this.nom = nom;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " " + nom;
    }
    
    
    
    }//Fin classe DTO

