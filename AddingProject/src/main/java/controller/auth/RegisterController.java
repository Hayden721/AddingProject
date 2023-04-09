package controller.auth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.User;
import service.face.RegisterService;
import service.impl.RegisterServiceImpl;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RegisterService registerService = new RegisterServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/add/register [GET]");
		
		
		
		req.getRequestDispatcher("/WEB-INF/views/auth/register.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/add/register [POST]");
		
		String paramId = req.getParameter("id");
		String paramPw = req.getParameter("pw");
		String paramPwCheck = req.getParameter("pwCheck");
		
		System.out.println("id = " + paramId + "\n" + "pw = " + paramPw +"\n" + "paramPwCheck = " + paramPwCheck );
		
		//user 객체를 사용 요청 파라미터 값 처리
		User getUserRegi = registerService.getUserRegister(req);
		
		// 파라미터값 DB에 Insert
		registerService.register(getUserRegi);
		
		//redirect
		resp.sendRedirect("/add");
		
		
	}
}
