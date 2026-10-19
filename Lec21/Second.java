package Lec21;
import java.util.Scanner;
public class Second {

	static int a=10;
	int c=30;
	static {
		int res=add(10);
	System.out.println(res);
	}
	int b=20;
	
	{
		System.out.println("Hello from instance");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");
//add(10);.
Second s=new Second();

	}
	public static int add(int a)
	{
//		sum();
		return a+10;
	}
public void sum()
{
	add(10);
	System.out.println("Inside sum");
}
}
