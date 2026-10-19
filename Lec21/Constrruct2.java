package Lec21;

public class Constrruct2 extends Construct {

	
	@Override
	public void push(int val)
	{
//		System.out.println("hello");
		if(size==arr.length)
		{
			int res[]=new int[arr.length*2];
			for(int i=0;i<arr.length;i++)
			{
				res[i]=arr[i];
			}
			super.arr=res;
			System.out.println(res.length);
		}
	
		tos++;
		arr[tos]=val;
		size++;
	}
}
