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
        
        HelloHelper hi = (HelloHelper) context.getBean("helloHelper");
        
        hi.sayIt();
        
        Nazdar nazdar = (Nazdar) context.getBean("noNazdar");
        
        nazdar.tedHned();
    }
}
