package glimmer;

import java.util.Scanner;

public class Diamond {
	//这个函数打印一个高度为n的空心菱形，保证n为奇数
	//如n=5,则打印如下图形：
	//  *
	// * *
	//*   *
	// * *
	//  *
	void print(int n){
		if ( n%2 == 1 )
		{
			for ( int j=0; j<n; j++ ) {
				for ( int i=0; i<n; i++ ) {
					int d = Math.abs((n-1)/2-j);
					if(i == d || i == n-d-1 ) {
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}	
				System.out.println();
			}
		}
		else
		{
			System.out.println("error");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Diamond dm = new Diamond();
		int x = in.nextInt();
		dm.print(x);

	}

}
