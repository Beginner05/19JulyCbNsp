package Lec1;

public class Create {

	
	
	
	int size=0;
	int arr[];
	public Create()
	{
		arr=new int[5];
	}
	public Create(int cap)
	{
		arr=new int[cap];
	}
	int frnt=0;
	int rare=0;
	public void enqueue(int val)
	{
		if(size==arr.length)
		{
			System.out.println("Full h");
			return;
		}
		arr[frnt%arr.length]=val;
		frnt++;
		size++;
	}
	public int dequeue()
	{
		if(size==0) {
			System.out.println("empty h");
			return -1;
		}
		int temp=arr[rare%arr.length];
		rare++;
	size--;
	return temp;
	}
}
