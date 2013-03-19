/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.equa_spring1;

/**
 *
 * @author User
 */
public class HelloWolrdMockImpl  implements Hello{
        private String message = "Hello from Mock";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
        
    public void pozdrav() {
       System.out.print("Hello World from Mock");
                
                }
    
}
