package dto;

import java.sql.Date;

public class User {
	public int userNo;
	public String userId;
	public String userPw;
	public Date userCredate;
	
	// 기본 생성자
	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userCredate=" + userCredate
				+ "]";
	}

	public User(int userNo, String userId, String userPw, Date userCredate) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPw = userPw;
		this.userCredate = userCredate;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public Date getUserCredate() {
		return userCredate;
	}

	public void setUserCredate(Date userCredate) {
		this.userCredate = userCredate;
	}
	
	
}
