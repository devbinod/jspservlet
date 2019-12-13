package np.com.pantbinod.daoimpl;

import np.com.pantbinod.dao.Dao;
import np.com.pantbinod.dbconnection.DBConnection;
import np.com.pantbinod.model.Grade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GradeDaoImpl implements Dao<Grade> {

    DBConnection dbConnection = new DBConnection();

    @Override
    public boolean add(Grade grade)  {
        dbConnection.open();
        String query = "insert into grade(name) values(?)";
        PreparedStatement preparedStatement = dbConnection.getPreparedStatement(query);

        int i = 0;
        try {
            preparedStatement.setString(1,grade.getName());

            i = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(i > 0) return true;
        return false;
    }

    @Override
    public boolean update(Grade grade) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Grade findById(int id) {
        dbConnection.open();
        String  query = "select * from grade where id= ?";
        PreparedStatement statement = dbConnection.getPreparedStatement(query);
        try {
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            Grade grade = new Grade();
            while (resultSet.next()){
                grade.setId(resultSet.getInt("id"))
                .setName(resultSet.getString("name"))
                ;

            }
            return grade;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Grade> findAll() {
        dbConnection.open();
        List<Grade> gradeList = new ArrayList<>();
        String query = "select * from grade";
        PreparedStatement statement = dbConnection.getPreparedStatement(query);
        try {
            ResultSet set = statement.executeQuery();
            while (set.next()){

                gradeList.add(new Grade(
                        set.getInt("id"),
                        set.getString("name")
                ));

            }
            return gradeList;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }
}
