package Lec10;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,6,0,3,2};
		sort(arr);
	}
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int idx=i;
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[idx]>arr[j])
			{
				idx=j;
			}
			
			}
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
