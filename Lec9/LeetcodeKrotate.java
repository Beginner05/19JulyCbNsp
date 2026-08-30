package Lec9;

public class LeetcodeKrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int k=8;
sol(arr,k);
	}
	public static void solOpt(int arr[],int k)
	{
		k=k%arr.length;
		int idx=arr.length-k;
		reverse(arr,idx,arr.length-1);
		reverse(arr,0,idx-1);
		reverse(arr,0,arr.length-1);
	}
	public static void reverse(int arr[],int strt,int end)
	{
		while(strt<end)
		{
			int temp=arr[strt];
			arr[strt]=arr[end];
			arr[end]=temp;
		strt++;
		end--;
		}
	}
	
	
	
	public static void sol(int arr[],int k)
	{
		k=k%arr.length;
		while(k-->0)
		{
			int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
//		arr[i]=temp;
		}
	}

}









