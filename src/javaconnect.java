// import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class javaconnect {
        Object conn;
public static java.sql.Connection ConnecrDb(){
  try{
     
     java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/isp", "root", "");
     return conn;
  } catch(Exception e){
      
  }
        return null;
}
}
