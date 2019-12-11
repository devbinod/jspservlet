package np.com.pantbinod.daoimpl;
import np.com.pantbinod.dao.Dao;
import np.com.pantbinod.dao.StudentDao;
import np.com.pantbinod.dbconnection.DBConnection;
import np.com.pantbinod.model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements Dao<Student>, StudentDao {
    DBConnection dbConnection = new DBConnection();
    public boolean add(Student student) {

        dbConnection.open();
        String query = "insert into student(first_name, last_name,address,phone_number) values(?,?,?,?)";
        PreparedStatement preparedStatement = dbConnection.getPreparedStatement(query);
        try {
            preparedStatement.setString(1,student.getFirstName());
            preparedStatement.setString(2,student.getLastName());
            preparedStatement.setString(3,student.getAddress());
            preparedStatement.setString(4,student.getPhoneNumber());
            int i = preparedStatement.executeUpdate();
            dbConnection.close();
            if(i > 0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }

    public boolean update(Student student) {
        return false;
    }

    public boolean delete(int id) {
        dbConnection.open();
        String query = "delete from student where id = ?";
        PreparedStatement preparedStatement = dbConnection.getPreparedStatement(query);
        try {
            preparedStatement.setInt(1,id);
            int i = preparedStatement.executeUpdate();
            dbConnection.close();
            if(i > 0 ) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public Student findById(int id) {

        dbConnection.open();
        String query = "select * from student where id = ?";
        PreparedStatement preparedStatement =dbConnection.getPreparedStatement(query);
        try {
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Student student = null;
            while (resultSet.next()){

                student = new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("address"),
                        resultSet.getString("phone_number")


                );
            }
            dbConnection.close();
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> findAll() {

        List<Student> studentList =new ArrayList<Student>();
        dbConnection.open();
        String query = "select * from student";
        PreparedStatement preparedStatement = dbConnection.getPreparedStatement(query);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                studentList.add(

                        new Student(
                                resultSet.getInt("id"),
                                resultSet.getString("first_name"),
                                resultSet.getString("last_name"),
                                resultSet.getString("address"),
                                resultSet.getString("phone_number")

                        )

                );
            }
            dbConnection.close();
            return studentList;



        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }


    public List<Student> findByFirstName(String firstName) {
        return null;
    }
}
