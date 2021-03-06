package chap06;

import java.util.Scanner;

public class BubbleSort3 {
	// 버블 정렬 세번째 방법
	
	// 배열의 두 요소를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 버블 정렬 과정
	static void bubbleSort(int[] a, int n) {
		int k = 0;
		while(k < n - 1) {
			int last = n - 1;
			for(int j = n - 1; j > k; j--) 
			{
				if(a[j - 1] > a[j])
				{
					swap(a, j - 1, j);
					last = j;
				}
			}
			
			k = last;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("버블정렬 세번째 방법");
		System.out.print("요솟수 : ");
		int nx = input.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++)
		{
			System.out.print("x[" + i + "]: ");
			x[i] = input.nextInt();
		}
		
		bubbleSort(x, nx); // 배열 x를 버블 정렬합니다.
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++)
		{
			System.out.println("x[" + i + "]=" + x[i]);
		}

	}

}
