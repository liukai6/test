package itbool.user.domain;

public class User {

	// ��Ա����
	private String userName;	// �û���
	private String passWord;	// ����
	public User() {
		super();
	}
	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + "]";
	}
}