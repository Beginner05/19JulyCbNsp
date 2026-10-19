package Lec20;

public class GenerateSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 15, 25 };
		int b[] = { 1, 5, 20, 30 };
		sol(a, b, true,0,0, 0, "");

	}

	public static void sol(int a[], int b[], boolean flag, int idxa,int idxb, int prev, String ans) {
		if (flag == true && ans.length() != 0) {
			System.out.println(ans);
		}
		if (flag == true) {
//			A sefor( element lena h;
			for (int i = idxa; i < a.length; i++) {
				if (a[i] > prev) {
					sol(a, b, false,i+1,idxb, a[i], ans + a[i] + " ");
				}
			}
		} else {
//			b se element lena h
			for (int i = idxb; i < b.length; i++) {
				if (b[i] > prev) {
					sol(a, b, true,idxa,i+1 ,b[i], ans + b[i] + " ");
				}
			}

		}

	}

}
