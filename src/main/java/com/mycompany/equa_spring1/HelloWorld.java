package com.mycompany.equa_spring1;


public class HelloWorld implements Hello {

    private String message = "Hello World regular";
    
    
    
    public void pozdrav(){
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String nazdar) {
        this.message = nazdar;
    }
    
    
    
    
}
