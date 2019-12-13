package np.com.pantbinod.dao;

import java.util.List;

public interface DaoFindByFirstNameAndLastName<T> {

List<T> findByFirstNameAndLastName(String firstName,String lastName);
}
