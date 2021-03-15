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
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요 : ");
		int x = input.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int y = input.nextInt();
		
		System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
	}

}
