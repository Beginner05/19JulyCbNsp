package Lec16;

public class First {

	public static void main(String args[]) {
		System.out.println("Hello ");
		int a = 10;
		int b = 20;

		fun();
		System.out.println("nextline");
		sol(a + b);
		System.out.println("bye");
	}

	public static void sol(int val) {
		int a = 10;
		int b = 20;
		System.out.println(a + b + val);
		return;
	}

	public static int fun() {
		int a = 90;
		int b = 100;
		System.out.println("Inside fun");
		return a + b + 10;
	}

}
