package Chapter5;

public class User {
	public int Id;
	public String Username;
	public String Password;
	public User() {
		
	}
	public User(String Username, String Password) {
//		this.Id = Id;
		this.Username = Username;
		this.Password = Password;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	

}
