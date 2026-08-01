package Lec4;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int nst = 1;
		int nsp = n - 1;
		int row = 0;
		while (row < n) {
			for (int space = 0; space < nsp; space++) {
				System.out.print("  ");
			}
			for (int stars = 0; stars < nst; stars++) {
				System.out.print("*   ");
			}
			nst++;
			nsp--;
			System.out.println();
			row++;
//			System.out.println(row);
		}

	}

}
