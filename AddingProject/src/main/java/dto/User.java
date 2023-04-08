package dto;

public class User {
	public int userNo;
	public String userId;
	public String userPw;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + "]";
	}

	public User(int userNo, String userId, String userPw) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPw = userPw;
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

}
