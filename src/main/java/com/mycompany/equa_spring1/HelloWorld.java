package com.mycompany.equa_spring1;


public class HelloWorld implements Hello {

    private String nazdar = "Hello World";
    
    
    
    public void pozdrav(){
        System.out.println(nazdar);
    }

    public String getNazdar() {
        return nazdar;
    }

    public void setNazdar(String nazdar) {
        this.nazdar = nazdar;
    }
    
    
    
    
}
