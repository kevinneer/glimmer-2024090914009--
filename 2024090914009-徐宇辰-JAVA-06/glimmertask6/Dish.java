package glimmertask6;

import java.util.Random;

public class Dish implements Order {

	private String name;//菜品名称
    private double price;//菜品价格

    public void profile(){
        java.lang.System.out.println("这是一个菜品的介绍");
    }

    Dish(String name,double price){
        this.name = name;
        this.price = price;
    };
    
    public String getName() {
    	return name;
    }
    
    public double getPrice() {
    	return price;
    }

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		java.lang.System.out.println("正在烹饪" + name);
		
	}

	@Override
	public boolean check() {
		// TODO Auto-generated method stub
		//随机返回true（表示原料足够可以烹饪该菜品）或者false（表示不能烹饪该菜品）
		Random rand = new Random();
		return rand.nextBoolean();
	}
    
    
}
