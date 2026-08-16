package Lec8;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int ans = sol(arr);
		System.out.println(ans);
	}

	public static int solOpt(int arr[])
	{
		int left[]=new int[arr.length];
		left[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			left[i]=Math.max(left[i-1], arr[i]);
		}
		int right[]=new int[arr.length];
		right[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1], arr[i]);
		}
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			int temp=Math.min(left[i], right[i]);
		ans+=temp-arr[i];
		}
		return ans;
		
		
		
		
		
		
		
	}
	public static int sol(int arr[]) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
//		i==0;
			int lMax = arr[i];
			int rMax = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				rMax = Math.max(rMax, arr[j]);
			}

			for (int j = i - 1; j >= 0; j--) {
				lMax = Math.max(lMax, arr[j]);
			}
			int temp = Math.min(lMax, rMax);
			ans += temp - arr[i];
		}

		return ans;

	}

}
