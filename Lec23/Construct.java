package Lec23;

public class Construct {

	int tail=0;
	int front=0;
	int size=0;
	int arr[];
	public Construct()
	{
		arr=new int[5];
	}
	public Construct(int capacity)
	{
		arr=new int[capacity];
	}
	public void enQueue(int val)
	{
		if(size==arr.length)
		{
			System.out.println("Queue is full");
			return;
		}
//		if(tail>=arr.length)tail=0;
		
		arr[tail%arr.length]=val;
		tail++;
		size++;
	}
	public int deQueue()
	{
		if(size==0)
		{
			System.out.println("q is Empty");
			return -1;
		}
		int temp=arr[front];
		
	front++;
	size--;
	return temp;
	}
	public int peek()
	{
		if(size==0)return -1;
		return arr[front];
		
	}
	public void display()
	{
		for(int i=front;i<tail;i++)
		{
			System.out.print(arr[i %arr.length]+ " ");
		}
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	
	
	
	
	
	
	
	
	
	
}
