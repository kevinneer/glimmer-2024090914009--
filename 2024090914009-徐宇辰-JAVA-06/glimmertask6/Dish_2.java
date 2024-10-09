package glimmertask6;

public class Dish_2 extends Dish {

	public Dish_2() {
		super("宫保鸡丁",25.0);
	}
	
	@Override
	public void profile() {
		java.lang.System.out.println("宫保鸡丁是一道……………………");
	}
	
	public static void main(String[] args) {
		Dish_2 dish2 = new Dish_2();
		dish2.profile();
		java.lang.System.out.println(dish2.getPrice());
		}
	
	@Override
    public void cook() {
		java.lang.System.out.println("麻婆豆腐的烹饪方法：……………………");
    }
	
}
