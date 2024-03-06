/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
import java.sql.*;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Aakash
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/workspace","root","");
        String q = "select * from employee";
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery(q);
        while(r.next()){
            System.out.println(r.getInt(1)+" "+ r.getString(2)+" "+r.getString(3)+" "+r.getInt(4));
        }
        q = "insert into employee values(?,?,?,?)";
        PreparedStatement p = c.prepareStatement(q);
        System.out.println("/n");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Employee Id");
        p.setInt(1, sc.nextInt());
        System.out.println("enter name");
        p.setString(2, sc.next());
        System.out.println("enter city");
        p.setString(3, sc.next());
        System.out.println("enter Age");
        p.setInt(4, sc.nextInt());
        int x = p.executeUpdate();
        System.out.println(x+"record inserted");
        q = "select * from employee";
        r = p.executeQuery(q);
        System.out.println("/n");
        while(r.next()){
            System.out.println(r.getInt(1)+" "+r.getString(2)+" "+ r.getString(3)+" "+r.getInt(4));
        }
        
    }
    
}
/*DELIMITER $$
CREATE PROCEDURE `insert_data`(IN emp_id Integer(10), IN emp_name Varchar(25), IN emp_city Varchar(25),IN emp_age Integer(3)) 
BEGIN
INSERT INTO employee(id,name,,city,age) VALUES (emp_id,emp_name,emp_city,emp_age);
COMMIT ;
END $$
DELIMITER ;*/