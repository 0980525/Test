package domain;

public class MemberVO {

	private String id;
	private String pw;
	private String email;
	private int age;
	private String regdate;
	private String lastlogin;
	
	public MemberVO() {}
	//login : id,pw
	public MemberVO(String id,String pw) {
		this.id=id;
		this.pw=pw;
	}
	//join, modify : id, pw,email,age
	public MemberVO(String id,String pw,String email,int age) {
		this.id=id;
		this.pw=pw;
		this.email=email;
		this.age=age;
	}
	//전체
	public MemberVO(String id,String pw,String email,int age,String regdate,String lastlogin) {
		this(id,pw,email,age);
		this.regdate=regdate;
		this.lastlogin=lastlogin;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", email=" + email + ", age=" + age + ", regdate=" + regdate
				+ ", lastlogin=" + lastlogin + "]";
	}
	
	
}
