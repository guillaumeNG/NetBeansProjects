/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converters;

import javafx.util.StringConverter;

/**
 *
 * @author Administrateur
 */
public class IntegerToStringConverter extends StringConverter<Number> {

    @Override
    /**
     *   Conversion d'un nombre en chaine de caractères.
     */
    public String toString(Number object) {
       return object.toString();
    }

    @Override
    /**
     * Conversion d'un nombre en chaine de nombre.
     */
    public Number fromString(String string) {
    return Integer.valueOf(string);    
    
    }  
} 
    
