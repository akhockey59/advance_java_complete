/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package springframework;

/**
 *
 * @author Aakash
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class SpringFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Resource r = new ClassPathResource("beans.xml");
       BeanFactory f = new XmlBeanFactory(r);
       employee s = (employee) f.getBean("a");
       s.show();
    }
    
}
