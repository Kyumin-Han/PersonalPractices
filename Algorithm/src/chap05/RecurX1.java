package chap05;

import java.util.Scanner;

public class RecurX1 {
	
	public static void recur(int n) {
		while(n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		
		int x = input.nextInt();
		
		recur(x);
	}
}
