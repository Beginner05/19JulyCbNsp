package Lec10;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,0,9,0,7};
	sort(arr);
	}
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{boolean flag=true;
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=false;
				}
			}
			if(flag==true)break;
		}
	}

}
