/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.equa_spring1;

/**
 *
 * @author User
 */
public class HelloHelper implements Hello {

    private String message;

   

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void pozdrav() {
        System.out.print(message);
    }
    
}
