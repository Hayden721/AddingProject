package dto;

public class User {
	public int user_no;
	public String user_id;
	public String user_pw;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [user_no=" + user_no + ", user_id=" + user_id + ", user_pw=" + user_pw + "]";
	}

	public User(int user_no, String user_id, String user_pw) {
		super();
		this.user_no = user_no;
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	
	
	
}
