package np.com.pantbinod.dao;

import np.com.pantbinod.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T>{

    boolean add(T t);
    boolean update(T t);
    boolean delete(int id);
    T findById(int id);
    List<T> findAll();

}
