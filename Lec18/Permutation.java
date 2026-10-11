package Lec18;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="vijay";
		sol(str,"");
	}
	public static void sol(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			sol(str.substring(0,i)+str.substring(i+1),ans+ch);
		}
	}

}
