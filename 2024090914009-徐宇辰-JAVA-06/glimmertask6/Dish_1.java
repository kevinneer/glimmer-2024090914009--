package glimmertask6;

public class Dish_1 extends Dish {

	public Dish_1() {
		super("麻婆豆腐",20.0);
	}
	
	@Override
	public void profile() {
		java.lang.System.out.println("麻婆豆腐是一道……………………");
	}
	
	public static void main(String[] args) {
		Dish_1 dish1 = new Dish_1();
		dish1.profile();
		java.lang.System.out.println(dish1.getPrice());
		}
	
	@Override
    public void cook() {
		java.lang.System.out.println("宫保鸡丁的烹饪方法：………………");
    }
	
}
