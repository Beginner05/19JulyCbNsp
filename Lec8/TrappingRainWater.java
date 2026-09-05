package Lec8;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {};
		sol(arr);
	}

	public static int sol(int arr[]) {
		int ans = 0;
		int left[] = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			left[i] = Math.max(arr[i], left[i - 1]);
		}
		int right[] = new int[arr.length];
		right[arr.length - 1] = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			int temp = Math.min(left[i], right[i]);
			ans += temp - arr[i];
		}
		return ans;
	}
}