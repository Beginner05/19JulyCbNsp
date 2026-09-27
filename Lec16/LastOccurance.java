package Lec16;

public class LastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,1,1};
		int res=find(arr,1,0);
		System.out.println(res);
	}
	public static int find(int arr[],int trgt,int idx)
	{
		if(arr.length==idx)return -1;
		if(arr[idx]==trgt)
		{
			int res=find(arr,trgt,idx+1);
			if(res==-1)
			{
				res=idx;
			}
			return res;
		}
		else {
			int res=find(arr,trgt,idx+1);
		return res;
		}
		
		
	}
	

}
