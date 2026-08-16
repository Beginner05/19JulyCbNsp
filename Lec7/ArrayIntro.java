package Lec7;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
int arr[]=new int[n];
System.out.println(arr.length);


for(int idx=0;idx<arr.length;idx++)
{
	arr[idx]=idx+1;
}


System.out.println(arr);

for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");	
}
	}

}
