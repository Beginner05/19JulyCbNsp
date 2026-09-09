package Lec11;

public class CargoShipment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int sol(int arr[], int days) {
		int ans = 0;
		int lo = 1;
		int hi = 0;
		for (int i = 0; i < arr.length; i++) {
			hi += arr[i];
		}
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isItPossible(arr, mid, days) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	

	public static boolean isItPossible(int arr[], int cap, int days) {
		int d = 1;
		int rcap = cap;
		for (int i = 0; i < arr.length;) {
			if (arr[i] <= rcap) {
				rcap = rcap - arr[i];
				i++;
			} else {
				d += 1;
				rcap = cap;
			}
			if (d > days)
				return false;
		}
		return true;
	}

}
