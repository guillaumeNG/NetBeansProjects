/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import javafx.application.Application;

/**
 *
 * @author Administrateur
 */
public abstract class Controller {
    //...Enregistrement de l'application
    protected Application mainApplication;
    
    /**
     * setter pour l'application
     * @param app 
     */
    public void setApplication(Application app){
        this.mainApplication = app;
    }
    
}
