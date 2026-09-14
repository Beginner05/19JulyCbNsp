package Lec14;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		String s1=a+b+40+"Hello"+90;
		System.out.println(s1);
		String s2=a+b+40+"Hello"+90+a+b+s1;
		System.out.println(s2);
	}

}
