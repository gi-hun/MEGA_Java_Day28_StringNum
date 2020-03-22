/*
 * # 문자열 속 숫자검사
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */
package day_28;

import java.util.Scanner;

public class StringEx14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		char[] charNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		while(true)
		{
			System.out.print("입력: ");
			String text = sc.next();
			
			int count = 0;
			for(int i=0;i<charNum.length;i++)
			{
				for(int j=0;j<text.length();j++)
				{
					if(charNum[i] == text.charAt(j))
					{
						count++;
					}
				}
			}
			
			if(count == text.length())
			{
				System.out.println("숫자만 있다");
			}
			else if(count == 0)
			{
				if(text.equals("종료"))
				{
					System.out.println("프로그램을 종료하겠습니다.");
					break;
				}
				else
				{
					System.out.println("문자만 있다");
				}
			}
			else
			{
				System.out.println("문자와 숫자가 섞여있다");
			}
			
		}
	}
}
