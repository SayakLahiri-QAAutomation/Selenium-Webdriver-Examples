package mysql;

/**
JDBC makes it possible for the java class to connect to the Database,
retrieve data from the database or for the matter of fact perform any of
the CRUD (Create/Read/Update/Delete) operations, manipulate the resultant data and close the connection.

 * Created by Maor on 4/14/2018.
 * Connect MySQL Database via JDBC connectivity. Create, Read, Update, and Delete operations on the Database.
 * Prerequisites:
 * 1. Download and install https://dev.mysql.com/downloads/installer/ --> Windows (x86, 32-bit), MSI Installer
 * 2. Open MySQL command line client from Start menu
      (default userName = "root"; password = "root";
 * Run commands:
 * 3. show databases;
 * 4. CREATE DATABASE test;
 * 5. use test
 * 5. show tables;
 * 6. CREATE TABLE user (id INT(6), name VARCHAR(20), city VARCHAR(20), age INT(6));
 * 7. INSERT INTO user (id, name, city, age) VALUES (?, '?', '?', ?)
 * 8. select * from user;
 * That's all - test DB is ready
 */

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.*;

import static org.testng.Assert.*;

public class MySqlActionsOnTable {

    private static String userName;
    private static String password;
    private static String dbURL;
    private static Connection dbconnection;

    @BeforeTest
    // Create Connection between Java to the DB
    public void setUp () {
        try {
            userName = "root";
            password = "root";

            /*Get connection to the DB:
            jdbc:mysql -> Java Database Connectivity API
            127.0.0.1 -> local host
            3307 -> port my SQL server is using
            test -> the DB name i created for testing*/

            dbURL = "jdbc:mysql://127.0.0.1:3307/test";
            Class.forName("com.mysql.jdbc.Driver");
        }

        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        }
    }

    @Test
    // Execute SQL Query - e.g. Select * to get all data from MySql table
    public static void ReadFromTable() {
        try {
            dbconnection = DriverManager.getConnection(dbURL, userName, password);
            Statement stmt  = dbconnection.createStatement();

            // Some Read Statement Variants below, in the same way, user can execute various queries on the database.

            /*String sqlStr = "select * from user where id ='1'";
            ResultSet resultSet  = stmt.executeQuery(sqlStr);
            System.out.println(String.format("Table contains below data:"));
            */

            /*String sqlStr = "select * from user where age = '18';";
            ResultSet resultSet  = stmt.executeQuery(sqlStr);
            System.out.println(String.format("Table contains below data:"));*/


            String sqlStr = "select * from user;";
            ResultSet resultSet  = stmt.executeQuery(sqlStr);
            System.out.println(String.format("Table contains below data:"));

            // Print the result until all the records are printed
            // res.next() returns true if there is any next record else returns false
            // String getString() -> Method is used to fetch the string type data from the result set

            while (resultSet .next()) {
                {
                    System.out.print(resultSet.getString(1));
                    System.out.print("-" + resultSet.getString(2));
                    System.out.print("-" + resultSet.getString(3));
                    System.out.println("-" + resultSet.getString(4));
                }

                // Verify all results not null i.e. there are non null records in our DB
                Assert.assertNotNull(resultSet.getString(1));
                Assert.assertNotNull(resultSet.getString(2));
                Assert.assertNotNull(resultSet.getString(3));
                Assert.assertNotNull(resultSet.getString(4));

            }

        }

        catch (SQLException e) {
            System.out.println("Connection to MySQL database failed");
            e.printStackTrace();

        }
    }

    @Test
    // Execute SQL Query - e.g. insert new data values to MySql table
    public static void WriteToTable() {
        PreparedStatement preparedStmt = null;
        try {
            // Create a mysql Database connection
            String myUrl = "jdbc:mysql://localhost:3307/test";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

            // The mysql insert statement
            String query = " Insert into user (id, name , city, age) values(?,?,?,?)";
            System.out.println("Insert statement Done!");

            // Create the mysql insert prepared statement
            preparedStmt = conn.prepareStatement(query);

            // 1/2/3/4 i.e column number and than the value to insert
            preparedStmt.setString(1, "9");
            preparedStmt.setString(2, "Shalomi");
            preparedStmt.setString(3, "Tel Aviv");
            preparedStmt.setString(4, "37");

            // Execute the query
            preparedStmt.execute();
            conn.close();

        } catch (Exception e) {
            System.out.println("Got an exception!");
            System.out.println(e.getMessage());
        }
    }

    @Test
    // Execute SQL Query - e.g. update data values in MySql table
    public static void UpdateValueInTable() {
        try {
            // Create a mysql Database connection
            String myUrl = "jdbc:mysql://localhost:3307/test";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

            // The mysql update statement
            String query = "update user set name = 'Frank', city = 'Paris', age = '68' where id = '9'";
            System.out.println("Update statement Done!");

            // Create the mysql update prepared statement
            PreparedStatement preparedStmt = conn.prepareStatement(query);

            // Execute the query
            preparedStmt.execute();
            conn.close();

        } catch (Exception e) {
            System.out.println("Got an exception!");
            System.out.println(e.getMessage());
        }

    }

    @Test
    // Execute SQL Query - e.g. Delete data values in MySql table
    public static void DeleteValueInTable() {
        try {
            // Create a mysql Database connection
            String myUrl = "jdbc:mysql://localhost:3307/test";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

            // The mysql delete statement
            String query = "delete from user where id = '9'";
            System.out.println("Delete statement Done!");

            // Create the mysql update prepared statement
            PreparedStatement preparedStmt = conn.prepareStatement(query);

            // Execute the query
            preparedStmt.execute();
            conn.close();

        }   catch (Exception e) {
            System.out.println("Got an exception!");
            System.out.println(e.getMessage());
        }

    }

    @AfterTest
    public void tearDown () throws Exception {
        // Close database connection to free used memory
            if (dbconnection != null) {
            dbconnection.close();
        }
    }
}
