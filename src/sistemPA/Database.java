package pemesanantiket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Database {
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String usename = "admin";
    private String pass = "tubespbd";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public Database(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "JDBC Driver Error (class salah)", JOptionPane.WARNING_MESSAGE);
        }
        
        try{
            con = DriverManager.getConnection(url, usename, pass);
            stmt = con.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "Connection Error (load ke database nya)", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String sqlnya){
        try{
            rs = stmt.executeQuery(sqlnya);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "Communication error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query(String sqlnya){
        try{
            stmt.executeUpdate(sqlnya);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error: "+e.getMessage(), "Communication Error 1", JOptionPane.WARNING_MESSAGE);
        }
    }
}
