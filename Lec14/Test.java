package Lec14;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abc";
		String s2="def";
		s1.concat(s2);
		s2.concat(s1);
		System.out.println(s1);
		System.out.println(s2);
		String s3="Hello"+"s1"+s2;
		System.out.println(s3);
		String s4=s1+"s2"+s3+"Ghi";
		System.out.println(s4);
	}

}
