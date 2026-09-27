package Lec15;

import java.util.Scanner;

public class LeetcodePalindomicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int res = sol(str);
	}

	public static int solOpt(String str) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			int prev = i - 1;
			int nxt = i + 1;
			cnt += 1;
			while (prev >= 0 && nxt < str.length()) {
				if (str.charAt(prev) == str.charAt(nxt)) {
					prev--;
					nxt++;
					cnt += 1;

				} else {
					break;
				}
			}

		}
		for (double i = 0.5; i < str.length(); i++) {
			int prev = (int) (i - 0.5);
			int nxt = (int) (i + 0.5);
			while (prev >= 0 && nxt < str.length()) {
				if (str.charAt(prev) == str.charAt(nxt)) {
					cnt++;
					nxt++;
					prev--;
				} else {
					break;
				}
			}

		}
		return cnt;
	}

	public static int sol(String str) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String s = str.substring(i, j + 1);
				boolean res = palindrome(s);
				if (res == true) {
					cnt += 1;
				}
			}
		}

		return cnt;
	}

	public static boolean palindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
