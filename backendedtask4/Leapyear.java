package glimmer;

import java.util.Scanner;

public class  Leapyear {

	//这个函数用于判断传入的年份是否为闰年
	//是闰年返回1，不是闰年返回2
	public boolean isLeapYear(int year){
		if ( (year % 4 == 0 && year %100 != 0)||( year %400 == 0) )
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Leapyear Lp = new Leapyear();
		int a = in.nextInt();	
		System.out.println(Lp.isLeapYear(a));
	}

}
