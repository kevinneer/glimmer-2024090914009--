package glimmertask6;

import java.util.ArrayList;
import java.util.List;

public class System {
	
	private static int orderNumber = 1;
	
	public void manageOrder(List<Order> dishes){
	        //要求1：一旦订单里有一个菜品的原料不足以烹饪，就输出“取消订单”，否则输出所有菜品的烹饪方法，最后再输出该订单的编号，编号从1开始递增。
		
		
		

		TableCustomer customer1 = new TableCustomer(1);
		WechatCustomer customer2 = new WechatCustomer("Home",true);
		
//		customer1.getInformation();
//		customer2.getInformation();
		
		boolean cookAble = true;
		//遍历订单
		for ( Order dish : dishes ) {
			if (!dish.check()) {
				java.lang.System.out.println("取消订单");//System与Java标准库中的java.lang.System类冲突,所以输出要写全
				cookAble = false;
				break;
			 	}
		 	}
		if (cookAble == true) {
			for (Order dish : dishes) {
				dish.cook();
			}
			java.lang.System.out.println("订单编号是：" + orderNumber);
			orderNumber++;	
//			deliver(customer1);
//			deliver(customer2);
			WhichCustomer.Which(customer1);
			WhichCustomer.Which(customer2);
		}
	}

//	private void deliver(Customer customer) {
//		//判断customer为哪一类
//		if (customer instanceof TableCustomer) {
//			//对customer造型，使其变为TableCustomer类
//            TableCustomer tableCustomer = (TableCustomer) customer;
//            java.lang.System.out.println("将餐送到餐桌 " + tableCustomer.tableId);
//        } else if (customer instanceof WechatCustomer) {
//        	//对customer造型，使其变为WechatCustomer类
//            WechatCustomer wechatCustomer = (WechatCustomer) customer;
//            if (wechatCustomer.takeout) {
//            	java.lang.System.out.println("将外卖送到 " + wechatCustomer.address);
//            } else {
//            	java.lang.System.out.println("顾客在店内堂食");
//            }
//        }
//	}
	
	public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Dish_1());
        orders.add(new Dish_2());
        new System().manageOrder(orders);
    }
}


