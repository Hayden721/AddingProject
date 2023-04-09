package dao.face;

import java.sql.Connection;

import dto.User;

public interface RegisterDao {

	public int inertRegi(Connection conn, User getUserRegi);
	
}
