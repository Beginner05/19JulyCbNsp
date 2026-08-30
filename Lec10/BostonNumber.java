package Lec10;
import java.util.Scanner;
public class BostonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol();
	}
	public static void sol()
	{
//		Scanner scn=new Scanner(System.in);
		int n=378;
		
		int digiSum=dSum(n);
		while(digiSum>=10)
		{
			digiSum=dSum(digiSum);
		}
//		System.out.println(digiSum);
		int primeSum=pSum(n);
		while(primeSum>=10)
		{
			primeSum=dSum(primeSum);
		}
		System.out.println(digiSum);
		System.out.println(primeSum);
if(primeSum==digiSum)System.out.println(1);
else System.out.println(0);

	}
	public static int pSum(int n)
	{
		int i=2;
		int sum=0;
		while(n>1)
		{
			if(n%i==0)
			{
				sum+=i;
				n=n/i;
//				System.out.println(i);
			}
			else {
				i++;
			}
		}
		return sum;
	}
	public static int dSum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
	 
	 return sum;
	}

}
