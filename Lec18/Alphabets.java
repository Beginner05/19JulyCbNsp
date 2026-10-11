package Lec18;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1023";
		sol(str, "");
	}

	public static void sol(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(0, i + 1);
			int val = Integer.parseInt(s);
			if(val==0)return;
			if (val > 26)
				return;
			val = val + 96;
			char ch = (char) val;
			sol(str.substring(i + 1), ans + ch);
		}

	}

}
