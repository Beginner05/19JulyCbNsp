package Lec17;

public class Construct {

	class Node {
		int val;
		Node left;
		Node right;
	}

	int arr[] = { 1, 4, 5, 6, 7, 9, 10 };
	Node root;root=construct(arr,0,arr.length-1);
}

public Node construct(int arr[],int lo,int hi)
{if(lo==hi)
{
Node nn=new Node();
nn.val=arr[lo];
return nn;
}
if(lo>hi)
{
	return null;
}
	int mid=(lo+hi)/2;
	Node nn=new Node();
	nn.val=arr[mid];
	nn.left=construct(arr,lo,mid-1);
	nn.right=construct(arr,mid+1,hi);
return nn;
}
