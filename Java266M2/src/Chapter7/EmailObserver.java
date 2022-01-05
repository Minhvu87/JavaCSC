package Chapter7;

public class EmailObserver extends Observer {
	public EmailObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Email: Ngân hàng AAA kính chào quý khách. Tài khoản của quý khách đã thay đổi.\n"
				+ "Số dư hiện tại là: "+account.getState() +"vnđ";
	}
	
}
