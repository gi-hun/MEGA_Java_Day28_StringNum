/*
 * # ���ڿ� �� ���ڰ˻�
 * ��) adklajsiod
 * 	     ���ڸ� �ִ�.
 * ��) 123123
 *    ���ڸ� �ִ�.
 * ��) dasd12312asd
 *    ���ڿ� ���ڰ� �����ִ�.
 */
package day_28;

import java.util.Scanner;

public class StringEx14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		char[] charNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		while(true)
		{
			System.out.print("�Է�: ");
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
				System.out.println("���ڸ� �ִ�");
			}
			else if(count == 0)
			{
				if(text.equals("����"))
				{
					System.out.println("���α׷��� �����ϰڽ��ϴ�.");
					break;
				}
				else
				{
					System.out.println("���ڸ� �ִ�");
				}
			}
			else
			{
				System.out.println("���ڿ� ���ڰ� �����ִ�");
			}
			
		}
	}
}
