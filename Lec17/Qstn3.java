package Lec17;

public class Qstn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=sol(5,0);
	System.out.print(res);
	}
	public static int sol(int n,int cnt)
	{
		
		if(n<0)return 10;
		if(n==0)return cnt;
		if(n%2==0)
		{
			return sol(n-2,cnt+1);
		}
		else {
			return sol(n-1,cnt);
		}
		
	}

}
