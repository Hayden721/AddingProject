package service.impl;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;

import common.JDBCTemplate;
import dao.face.RegisterDao;
import dao.impl.RegisterDaoImpl;
import dto.User;
import service.face.RegisterService;

public class RegisterServiceImpl implements RegisterService {
	
	//Dao 객체
	RegisterDao registerDao = new RegisterDaoImpl();
	
	@Override
		public User getUserRegister(HttpServletRequest req) {
		
		User user = new User();
		user.setUserId(req.getParameter("id"));
		user.setUserPw(req.getParameter("pw"));
		
		return user;
		}

	@Override
	public void register(User getUserRegi) {
		Connection conn = JDBCTemplate.getConnection();
		
		if(registerDao.inertRegi(conn, getUserRegi) > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}

	}
	
	
}
