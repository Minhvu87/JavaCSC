package Chapter7;

public class MobiObserver extends Observer{
	public MobiObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Mobi: Xin chao. Tài khoản của quý khách đã thay đổi.\n"
				+ "Số dư hiện tại là: "+account.getState() +"vnđ";
	}
}
