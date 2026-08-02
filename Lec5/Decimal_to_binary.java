package Lec5;

public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=45;
		int multi=1;
		int ans=0;
		while(n>0)
		{
			int rem=n%2;
			ans+=rem*multi;
			n=n/2;
			multi=multi*10;
		}
		System.out.println(ans);
	}

}
