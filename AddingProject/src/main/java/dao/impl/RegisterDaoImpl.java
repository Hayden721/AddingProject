package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JDBCTemplate;
import dao.face.RegisterDao;
import dto.User;

public class RegisterDaoImpl implements RegisterDao{
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	@Override
	public int inertRegi(Connection conn, User getUserRegi) {
		
		String sql = "";
		sql += "INSERT INTO ADD_USER(USER_NO, USER_ID, USER_PW)";
		sql += "	VALUES(ADD_USER_SQ.nextval, ?, ?)";
		
		int res = 0;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, getUserRegi.getUserId());
			ps.setString(2, getUserRegi.getUserPw());
			
			res = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(ps);
			JDBCTemplate.close(rs);
		}
		return res;
	}
}
