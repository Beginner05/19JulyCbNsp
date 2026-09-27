package Lec15;

import java.util.Scanner;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str=scn.next();
String pat=scn.next();
sol(str,pat);
	}
	public static boolean sol(String str,String pat)
	{
		for(int i=0;i<=str.length()-pat.length();i++)
		{
			
			int j=0;
			while(j<pat.length()&&pat.charAt(j)==str.charAt(i+j))
			{
				j++;
			}
			if(j==pat.length()) {
			return true;	
			}
			i++;
		}
		return false;
	}

}
