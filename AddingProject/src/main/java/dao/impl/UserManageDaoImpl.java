package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.JDBCTemplate;
import dao.face.UserManageDao;
import dto.User;

public class UserManageDaoImpl implements UserManageDao{
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public List<User> selectUserAll(Connection conn) {
		String sql = "";
		sql += "SELECT USER_NO, USER_ID, USER_PW, USER_CREDATE";
		sql += "	FROM ADD_USER";
		sql += "	ORDER BY USER_NO";
		
		List<User> userList = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(); // User객체 반환을 위해 executeQuery() 사용
			
			while(rs.next()) {
				// 조회 결과의 데이터를 저장할 객체
				User user = new User();
				user.setUserNo(rs.getInt("user_no")); // DB컬럼의 이름을 입력
				user.setUserId(rs.getString("user_id"));
				user.setUserPw(rs.getString("user_pw"));
				user.setUserCredate(rs.getDate("user_credate"));
				userList.add(user);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(ps);
			JDBCTemplate.close(rs);
		}
		
		System.out.println("UserManageDao - selectUserAll() 종료");
		return userList;
	}
}
