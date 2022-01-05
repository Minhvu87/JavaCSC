package Chapter5;

public class Employee {
	private int id;
	private String hoTen;
	private String cmnd;
	private long mucLuong;
	public Employee(int id, String hoTen, String cmnd, long mucLuong) {
		this.id = id;
		this.hoTen = hoTen;
		this.cmnd = cmnd;
		this.mucLuong = mucLuong;
	}
	
	@Override
	public String toString() {
		return id + "\t" + hoTen + "\t\t" + cmnd + "\t\t" + mucLuong ;
	}
}
