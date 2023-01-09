import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;

public class DbHelper {

    private String userName = "root";
    private String password = "tatarsaid2326";
    private String dbUrl = "jdbc:mysql://localhost:3306/husrev";



    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void showErrorMessage(SQLException sqlException){
        System.out.println("Error : " + sqlException.getMessage());
        System.out.println("Error Code : " + sqlException.getErrorCode());
    }

}
