package t3h.Chapter1;

public class Contact {
    private String fullName;
    private String email;
    private String address;
    private String subject;
    private String message;
    private boolean gender;
	public Contact(String fullName, String email, String address, String subject, String message, boolean gender) {
		this.fullName = fullName;
		this.email = email;
		this.address = address;
		this.subject = subject;
		this.message = message;
		this.gender = gender;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
    
}
