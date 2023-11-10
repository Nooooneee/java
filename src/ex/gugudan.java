package ex;

public class gugudan
{
	public static void main(String[] args)
	{

		int su = 1;
		// 단의 대한 조건(2~9단까지)
		while (su <= 9)
		{
			// 수를 표현한 변수
			int dan = 2;
			// 수에 대한 조건(1~9까지 단이 고정된 상태에서 증가한다)
			while (dan <= 9)
			{
				// 구구단을 출력한다.
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan * su));
				// 숫자하나를 출력한 후 스페이스(공백)를 출력한다.
				System.out.print(" ");
				// 수에 대한 증가
				dan++;
			}
			System.out.println(); // 줄바꿈
			// 단을 1증가 시킨다.
			su++;
			
		}
		System.out.println("\n=========================\n");
	}
}
