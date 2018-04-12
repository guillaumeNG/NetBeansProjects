/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.database;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Administrateur
 */
public class PersonDTO {

    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleStringProperty firstname = new SimpleStringProperty();

    private SimpleIntegerProperty id = new SimpleIntegerProperty();

    //Association entre une instance de Personne et une instance de Pays
    //enrobage de cette classe dans un SimpleObjectProperty
    private SimpleObjectProperty<PaysDTO> pays = new SimpleObjectProperty<>();

    public PersonDTO() {
    }

    public String getName() {
        return name.get();
    }
    
    public SimpleStringProperty getNameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getFirstname() {
        return firstname.get();
    }
    
     public SimpleStringProperty getFirstnameProperty() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname.set(firstname);
    }

    public PaysDTO getPays() {
        return pays.get();
    }

    public void setPays(PaysDTO pays) {
        this.pays.set(pays);
    }
    
     public SimpleObjectProperty getPaysProperty() {
        return pays;
    }

    public SimpleIntegerProperty getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id.set(id);
    }
    
     public SimpleIntegerProperty getidProperty() {
        return id;
    }

    void SetId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
