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
        
        String hi = (String) context.getBean("helloHelper");
        
        System.out.print(hi);
        
        Nazdar nazdar = (Nazdar) context.getBean("noNazdar");
        
        nazdar.tedHned();
    }
}
