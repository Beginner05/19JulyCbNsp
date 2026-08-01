package Lec3;
import java.util.Scanner;
public class Pattern8 {

public static void main(String args[])
{
	
	Scanner scn=new Scanner(System.in);
	int arr[]=new int[10];
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scn.nextInt();
	 max=Math.max(max, arr[i]);
	min=Math.min(min,arr[i]);
	}
	System.out.println(min);
	System.out.println(max);
}
}