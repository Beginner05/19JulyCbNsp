package Lec11;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 3, 4, 6, 8 };
		int trgt = 8;
		find(arr, trgt);
	}

	public static int find(int arr[], int trgt) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == trgt) {
				return mid;
			} else if (arr[mid] > trgt) {
				hi = mid - 1;
			} else if (arr[mid] < trgt) {
				lo = mid + 1;
			}

		}
return -1;
	}

}
