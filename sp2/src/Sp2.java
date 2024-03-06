/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package sp2;

/**
 *
 * @author Aakash
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class Sp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Resource r = new ClassPathResource("beans.xml");
       BeanFactory f = new XmlBeanFactory(r);
       constructorversion a = (constructorversion) f.getBean("a");
       a.show();
    }
    
}
