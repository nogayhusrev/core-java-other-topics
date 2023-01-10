import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


    }

    public static void delete() {
        DbHelper dbHelper = new DbHelper();
        Connection connection;
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            int count = statement.executeUpdate("delete from customers where customerNumber=1000");
            System.out.println(count);
            selectDemo();
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
    }

    public static void update() {
        DbHelper dbHelper = new DbHelper();
        Connection connection;
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("UPDATE customers set customerName='Adam' where id=1000");
            int count = statement.executeUpdate("UPDATE customers set customerName='Adam' where customerNumber=1000");
            System.out.println(count);

        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
    }

    public static void insertOnto() {

        DbHelper dbHelper = new DbHelper();
        Connection connection;
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("INSERT INTO customers (customerName) values ('husrev')");
            int count = statement.executeUpdate("INSERT INTO customers (customerNumber, customerName) values (1000,'husrev')");
            System.out.println(count);
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
    }

    public static void selectDemo() {
        DbHelper dbHelper = new DbHelper();
        Connection connection;
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select customerNumber,customerName from customers");
            List<Customer> list = new ArrayList<>();
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setNumber(resultSet.getInt(1));
                customer.setName(resultSet.getString(2));
                list.add(customer);
            }
            list.forEach(System.out::println);

        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        }
    }

}
