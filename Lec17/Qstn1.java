package Lec17;

public class Qstn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=sol(5);
	System.out.println(res);
	}

	public static int sol(int n)
{
	if(n==0)return n;
	int res=sol(n-1)+n;
return res;
}












}
