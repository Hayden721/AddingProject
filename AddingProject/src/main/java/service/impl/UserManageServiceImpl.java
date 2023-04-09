package service.impl;

import java.sql.Connection;
import java.util.List;

import common.JDBCTemplate;
import dao.face.UserManageDao;
import dao.impl.UserManageDaoImpl;
import dto.User;
import service.face.UserManageService;

public class UserManageServiceImpl implements UserManageService{
	
	private UserManageDao userManageDao = new UserManageDaoImpl();
	Connection conn = JDBCTemplate.getConnection();
	
	@Override
	public List<User> userList() {
		System.out.println("UserManageService - userList() 호출");
		List<User> userList = userManageDao.selectUserAll(conn);
		
		System.out.println("UserManageService - userList() user 조회");
		return userList;
	}
}
