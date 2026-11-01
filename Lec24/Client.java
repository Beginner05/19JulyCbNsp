package Lec24;

import java.util.Arrays;
import java.util.Comparator;

public class Client {

class pair  implements Comparable<pair>{
	int v1;
	int v2;
	@Override
	public int compareTo(pair o) {
		// TODO Auto-generated method stub
		return o.v1-this.v1;
	}
	public String toString()
	{
		return v1+" "+v2;
	}
	
}
public void fill()
{
	pair arr[]=new pair[5];
	for(int i=0;i<arr.length;i++)
	{
		pair p=new pair();
		p.v1=i;
		p.v2=i+1*10;
	arr[i]=p;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	Arrays.sort(arr);
	System.out.println();
//System.out.println(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
public static void main(String args[])
{
	Client c=new Client();
	
	c.fill();
}
}
