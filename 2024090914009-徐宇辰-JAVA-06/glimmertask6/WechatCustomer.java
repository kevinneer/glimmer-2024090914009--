package glimmertask6;

public class WechatCustomer implements Customer{
	
	public String address;
	public boolean takeout;
	
	public WechatCustomer(String address, boolean takeout) {
        this.address = address;
        this.takeout = takeout;
    }

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		java.lang.System.out.println("客人的地址是：" + address + "\n是否外带" + takeout );
	}

	
	
}
