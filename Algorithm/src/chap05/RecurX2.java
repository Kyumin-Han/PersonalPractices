package chap05;

import java.util.Scanner;
import java.util.Stack;

public class RecurX2 {
	
	public static void recur(int n) {
		Stack s = new Stack();
		while(true)
		{
			if(n > 0) 
			{
				s.push(n);
				n = n - 1;
				continue;
			}
			if(s.isEmpty() != true)
			{
				n = (int)s.pop();
				System.out.println(n);
				n = n -2;
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int x = input.nextInt();
		
		recur(x);
	}
}
