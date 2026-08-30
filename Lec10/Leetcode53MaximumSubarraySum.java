package Lec10;

public class Leetcode53MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -10, 2};
		int max = 0;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
//			int sum = 0;
			for (int j = i; j < arr.length; j++) {

				for (int k = i; k <= j; k++) {
//			System.out.print(arr[k]+" ");
					sum += arr[k];
				}
				max = Math.max(sum, max);
				System.out.println();
			}
	
		}
		System.out.println(sum);
	}

}
