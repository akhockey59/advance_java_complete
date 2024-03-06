/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package getsetmethods;

/**
 *
 * @author Aakash
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Getsetmethods {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
        student s = (student) c.getBean("s");
        s.getName();
        s.show();
    }
    
}
