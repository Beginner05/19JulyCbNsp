package Lec4;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		boolean flag=true;
		for(int i=1;i<n;i++)
		{
			if(i==1)
			{
				continue;
			}
			if(n%i==0)
			{
//		System.out.println("Prime nhi h");
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		System.out.println("Prime h");
		
		else {
			System.out.println("Not prime");
		}
	}

}
