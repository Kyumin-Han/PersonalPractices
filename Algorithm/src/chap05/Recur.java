package chap05;

import java.util.Scanner;

public class Recur {
	
	public static void recur(int n) {
		if(n > 0)
		{
			recur(n - 1);
			System.out.print(n);
			recur(n - 2);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int x = input.nextInt();
		
		recur(x);
	}
}
