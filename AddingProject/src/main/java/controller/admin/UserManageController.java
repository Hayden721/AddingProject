package controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.User;
import service.face.UserManageService;
import service.impl.UserManageServiceImpl;

@WebServlet("/user/manage")
public class UserManageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 서비스 객체
	private UserManageService userManageService = new UserManageServiceImpl();
	
	@Override
	// req 응답 객체, resp 요청 객체 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/user/manage [GET]");
		
		//유저 전체 조회
		List<User> userList = userManageService.userList();
		
		// 조회결과 jsp로 전달
		req.setAttribute("userAllList", userList);
		
		req.getRequestDispatcher("/WEB-INF/views/admin/admin.jsp").forward(req, resp);
	}
}
