package chap05;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if(n > 0)
		{
			return n * factorial(n-1);
		}
		else 
		{
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = input.nextInt();
		
		System.out.println(x + "�� ���丮���� " + factorial(x) + "�Դϴ�.");
	}

}
