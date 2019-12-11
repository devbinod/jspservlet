package np.com.pantbinod.dao;

import np.com.pantbinod.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findByFirstName(String firstName);
}
