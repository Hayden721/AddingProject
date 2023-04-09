package dao.face;

import java.sql.Connection;
import java.util.List;

import dto.User;

public interface UserManageDao {

	List<User> selectUserAll(Connection conn);

}
