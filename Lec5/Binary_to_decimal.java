package Lec5;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ans=0;
//int 0b01111;
//int n=01010010;
//int n=0b01111;
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
//System.out.println(n/10);
int multi=1;
while(n>0)
{
	int rem=n%10;
	ans=ans+rem*multi;
	multi=multi*2;
	n=n/10;
}
System.out.println(ans);

	}

}
