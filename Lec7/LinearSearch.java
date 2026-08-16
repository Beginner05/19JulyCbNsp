package Lec7;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("Trgt value dede bhai");
		int trgt = scn.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int res = find(arr, trgt);
		System.out.println(res);

	}

	public static int find(int[] arr, int trgt) {
		int idx = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == trgt) {
				idx = i;
				break;
			}
		}
		return idx;
	}

}
