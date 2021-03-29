package chap06;

import java.util.Scanner;

public class SelectionSort {
	// �ܼ� ���� ����(�迭 ���� ���� ���� ��Ҹ� �˸��� �ڸ��� ����)
	static void selectionSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++)
		{
			int min = i;
			for(int j = i + 1; j < n; j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			
			swap(a, i , min);
		}
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
		
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�������� ù��° ���");
		System.out.print("��ڼ� : ");
		int nx = input.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++)
		{
			System.out.print("x[" + i + "]: ");
			x[i] = input.nextInt();
		}
		
		selectionSort(x, nx); // �迭 x�� ���� �����մϴ�.
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < nx; i++)
		{
			System.out.println("x[" + i + "]=" + x[i]);
		}

	}

}
