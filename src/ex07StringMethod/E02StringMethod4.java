package ex07StringMethod;

public class E02StringMethod4
{
	public static void main(String[] args)
	{
		System.out.println("#시나리오1#");
		String juminNumString = "010419-2000000";
		String ju;
		if(juminNumString.charAt(7) == '1' || juminNumString.charAt(7) == '3')System.out.println("남자");
		else if(juminNumString.charAt(7) == '2' || juminNumString.charAt(7) == '4') System.out.println("여자");
		
		//System.in.read();
		System.out.println();
		System.out.println("#시나리오2#");
		
		String email1 = "hong@daum.net";
		String email2 = "hong@naver";
		
		if(email1.contains("@") && email1.contains("."))
		{
			System.out.println("이메일 형식입니다.");
		}
		else
		{
			System.out.println("이메일 형식이 아닙니다.");
		}
		
		if(email2.contains("@") && email2.contains("."))
		{
			System.out.println("이메일 형식입니다.");
		}
		else
		{
			System.out.println("이메일 형식이 아닙니다.");
		}
		
		String juminNum1 = "010419-3123456";
		
		
		if(juminNumString.charAt(juminNum1.indexOf('-')+1) == '1' || juminNumString.charAt(juminNum1.indexOf('-')+1) == '3')System.out.println("남자");
		else if(juminNumString.charAt(juminNum1.indexOf('-')+1) == '2' || juminNumString.charAt(juminNum1.indexOf('-')+1) == '4') System.out.println("여자");
		
		String fileName;
		
		
	}
}
