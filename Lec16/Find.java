package Lec16;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,6,9,10};
		int trgt=9;
		int res=find(arr,trgt,0);
	System.out.println(res);
	}
	public static int find(int arr[],int trgt,int idx)
	{
		if(arr.length==idx)return -1;
		
		if(arr[idx]==trgt)
		{
			return idx;
		}
	int res=find(arr,trgt,idx+1);	
	return res;
	}
	
	
	
	
	
	
	

}
