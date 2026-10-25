package Lec22;

import java.util.Stack;

public class Leetcode84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 5, 6, 2, 3 };
		int res = sol(arr);
		System.out.println(res);
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

		for (int i = 0; i < arr.length; i++) {
			System.out.print(left[i] + " ");
//			System.out.print(right[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(right[i] + " ");
//			System.out.print(right[i]+" ");
		}
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
