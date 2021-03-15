package chap05;

import java.util.Scanner;

public class EuclidGCD {

	public static int gcd(int x, int y) {
		if(y == 0)
		{
			return x;
		}
		else
		{
			return gcd(x, x % y);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = input.nextInt();
		
		System.out.print("������ �Է��ϼ��� : ");
		int y = input.nextInt();
		
		System.out.println("�ִ� ������� " + gcd(x, y) + "�Դϴ�.");
	}

}
