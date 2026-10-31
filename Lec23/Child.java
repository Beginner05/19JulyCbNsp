package Lec23;

public class Child extends Construct{

	
	
	public void enQueue(int val)
	{
		if(size==arr.length)
		{
			int res[]=new int[arr.length*2];
			int k=0;
			for(int i=front;i<tail;i++)
			{
				res[k]=arr[i%arr.length];
						k++;
			}
			front=0;
			arr=res;
		}
		arr[tail%arr.length]=val;
		size++;
		tail++;
	}
}
