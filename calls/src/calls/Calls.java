package calls;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Connection; 
import java.util.Scanner;
public class Calls {
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/workspace","root","");
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter id");
            int st_id = sc.nextInt();
            System.out.println("enter Name");
            String st_name = sc.next();
            System.out.println("enter city");
            String st_city = sc.next();
             CallableStatement cs = c.prepareCall("{call insert_data(?,?,?)}");
             cs.setInt(1,st_id);
             cs.setString(2, st_name);
             cs.setString(3, st_city);
             cs.execute();
             System.out.println("want to add more records write yes or no");
             String ans = sc.next();
             if(ans.equals("no")){
                 break;
             }
             System.out.println("record inserted");
        }
    }
}