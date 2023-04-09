package service.face;

import javax.servlet.http.HttpServletRequest;

import dto.User;

public interface RegisterService {

	public User getUserRegister(HttpServletRequest req);

	public void register(User getUserRegi);

	

}
