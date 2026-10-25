package Lec22;

import java.util.Stack;

public class Leetcode85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
int res[]=new int[arr[0].length];
for(int i=0;i<arr.length;i++)
{
	for(int col=0;col<arr[0].length;col++)
	{
		if(arr[i][col]==1)
		{
			res[col]=res[col]+1;
		}
		else {
			res[col]=0;
		}
	}
	int ans=sol(res);
System.out.println(ans);
}
	}
	public static int sol(int arr[]) {
		int right[] = new int[arr.length];
		Stack<Integer> s = new Stack();
		for (int i = 0; i < arr.length; i++) {
			while (s.isEmpty() == false && arr[s.peek()] > arr[i]) {
				right[s.pop()] = i;
			}
			s.push(i);
		}

		while (s.isEmpty() == false) {
			right[s.pop()] = -1;
		}
		int left[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (s.isEmpty() == false && arr[s.peek()] > arr[i]) {
				left[s.pop()] = i;
			}
			s.push(i);
		}
		while (s.isEmpty() == false) {
			left[s.pop()] = -1;
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(left[i] + " ");
////			System.out.print(right[i]+" ");
//		}
//		System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(right[i] + " ");
////			System.out.print(right[i]+" ");
//		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
//		case 1 left[i]==-1&&right[i]==-1
			if (left[i] == -1 && right[i] == -1) {
				int area = arr.length * arr[i];
				max = Math.max(area, max);
			} else if (left[i] == -1 && right[i] != -1) {
				int lc = i;
				int rc = right[i] - i - 1;
				int width = rc + lc + 1;
				int area = width * arr[i];
				max = Math.max(area, max);
			} else if (left[i] != -1 && right[i] == -1) {
				int rc = arr.length - i - 1;
				int lc = i - left[i] - 1;
				int width = rc + lc + 1;
				int area = width * arr[i];
				max = Math.max(area, max);
			} else if (left[i] != -1 && right[i] != -1) {
				int lc = i - left[i] - 1;
				int rc = right[i] - i - 1;
				int width = lc + rc + 1;
				int area = width * arr[i];
				max = Math.max(area, max);
			}
		}
		return max;

	}

	

}
