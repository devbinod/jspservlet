package np.com.pantbinod.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

    private static final String USER_NAME="root";
    private static final String PASSWORD="binod";
    private static final String URL="jdbc:mysql://localhost:3306/jdbcdemo";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    public void open(){
        try {
            Class.forName(DRIVER);
            System.out.println("driver loaded..");
            connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            System.out.println("connection open");
        } catch (Exception  e) {
            e.printStackTrace();
        }

    }


    public PreparedStatement getPreparedStatement(String query) {

        try {
            preparedStatement = connection.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }


    public void close() throws SQLException {
        connection.close();
    }
}
