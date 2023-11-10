package ex04controlstatement;

import java.io.IOException;

public class ex
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("하나의 문자를 입력하세요 : ");
		
		int i = System.in.read();
		
		System.out.println((58>i && i>47) ? "숫자입니다." : "숫자가 아닙니다." );
		
		int num = 120;
		
		if( num > 0 && num % 2 == 0) System.out.println("양수이면서 짝수");
		
		int num1=50, num2=100;
		int big, diff;
		
		big = (num1>num2)? num1:num2; 

		if( num1>num2)
		{
			big = num1;
		}
		else
		{
			big = num2;
		}
		
		System.out.println(big);

		diff = (num1>num2)? num1-num2: num2-num1;
		
		if( num1>num2)
		{
			diff = num1-num2;
		}
		else
		{
			diff = num2-num1;
		}
		System.out.println(diff); 
		
	
		int l = 0;
		while(l <= 5)
		{
			int k = 0;
			while(k<l)
			{
				System.out.print("*");
				k++;
			}
			System.out.println("");
			l++;
		}
		
		System.out.println("");
		
		int m = 5;
		
		do 
		{
			int k = 0;
			
			do 
			{
				System.out.print("*");
				k++;
			}
			while(k<m);
			System.out.println("");
			m--;
		}
		while(m > 0);
			

		
		System.out.println("");
		
		for(int n = 0; n<5; n++)
		{
			for(int h = 0; h<5-n; h++)
			{
				System.out.print(" ");
			}
			for(int o = 0; o<n*2+1; o++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		
		for(int n = 0; n<5; n++)
		{
			for(int h = 0; h<n; h++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int n = 0; n<5; n++)
		{
			for(int h = 5; h>0+n; h--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
