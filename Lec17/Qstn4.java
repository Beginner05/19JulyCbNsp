package Lec17;

public class Qstn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol(1321,1);
	}
	public static void sol(int n,int multi)
	{
		if(n==0)return;
	int rem=n%10;
	System.out.println(rem*multi);
	sol(n/10,multi*10);
		
	}

}
