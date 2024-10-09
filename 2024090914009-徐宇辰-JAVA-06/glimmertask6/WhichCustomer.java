package glimmertask6;

public class WhichCustomer {
	//使用泛型可以接受任何类型的对象，可以根据对象执行不同的操作
	public static <T> void Which(T item) {
        if (item instanceof TableCustomer) {
        	java.lang.System.out.println("餐桌编号: " + ((TableCustomer) item).tableId);//造型后才能用子类的方法
        } else if (item instanceof WechatCustomer) {
        	java.lang.System.out.println("地址: " + ((WechatCustomer) item).address);
        }
    }
}
