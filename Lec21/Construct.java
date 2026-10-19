package Lec21;

public class Construct {

	
	int tos=-1;
	int size=0;
	int arr[];
	public Construct()
	{
		arr=new int[5];
	}
	public void push(int val)
	{
		if(size==arr.length)
		{
			System.out.println("Stack  full h");
			return;
		}
		tos++;
		arr[tos]=val;
		size++;
		
	}
	public int pop()
	{if(tos==-1)
	{
		System.out.println("Stack Khali h");
		return -1;
	}
		int temp=arr[tos];
		tos--;
		size--;
		return temp;
	}
	
	public int peek()
	{
		if(tos==-1)
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return arr[tos];
		
	}
		public int size()
		{
			return size;
		}
	public boolean isEmpty()
	{
//		return tos==-1;
	if(tos==-1)
	{
		return true;
	}
	return false;
	}
	public void display()
	{
		for(int i=tos;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	
	
	
	
	
}
