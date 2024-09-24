package hello;

import java.util.Scanner;
	 
public class HelloJava{
	
	 public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 for ( int i=0; i<3; i++)
	 {
		 int x = in.nextInt();
		 System.out.print(x+" ");
	 }
	 }
	 
}