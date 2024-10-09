package glimmertask6;

public class TableCustomer implements Customer{

	
	public int tableId;
	
	public TableCustomer(int tableId) {
		this.tableId = tableId;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		java.lang.System.out.println("客人的餐桌编码是"+tableId);
	}

	
	
}
