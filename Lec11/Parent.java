package Lec11;

public class Parent {

	static int val=4;
	public static boolean isBadVersion(int n)
	{
		if(n>=val)return true;
		return false;
	}
}
