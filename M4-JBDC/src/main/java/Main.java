import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {




    public static void main(String[] args) {

        DbHelper dbHelper = new DbHelper();
        Connection connection;
        try {
            connection = dbHelper.getConnection();
            System.out.println("Connected");
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }

    }

}
