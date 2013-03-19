package com.mycompany.equa_spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        
        Hello hi = (Hello) context.getBean("helloWorld");
        
        hi.pozdrav();
        
        Nazdar nazdar = (Nazdar) context.getBean("noNazdar");
        
        nazdar.tedHned();
    }
}
