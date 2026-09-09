package Lec11;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][];
Scanner scn=new Scanner(System.in);
for(int row=0;row<arr.length;row++)
{
	System.out.println("enter the no of cols for row "+ row);
	int n=scn.nextInt();
	arr[row]=new int[n];
for(int col=0;col<arr[row].length;col++)
{
System.out.println("enter the calue for row"+ row+ "col "+col);
arr[row][col]=scn.nextInt();
}
}
	}

}
