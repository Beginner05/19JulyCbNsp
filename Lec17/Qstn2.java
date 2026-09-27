package Lec17;

public class Qstn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=sol(3,"");
	System.out.println(res);
	}
	public static int sol(int n,String ans)
	{
		if(n==0||n==5)return n;
		int a=sol(n-1,ans+n);
		System.out.println(ans);
		int b=sol(n+1,ans+n);
	return a+b;
	}

}
