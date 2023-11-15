package ex07StringMethod;

public class E03StringBuilderBuffer
{
	public static void main(String[] args)
	{

		StringBuffer strBuf = new StringBuffer("AB");
		
		strBuf.append(25);
		strBuf.append("Y").append(true);
		
		System.out.println("strBuf=" + strBuf);
		
		strBuf.insert(2, false);
		strBuf.insert(strBuf.length(), 'Z');
		
		System.out.println("strBuf=" + strBuf);
		System.out.println("String과 StringBuffero의" + "참조값 비교");
		
		String str1 = "Java&JSP";
		String str2 = "Java&JSP";
		
		if (str1 == str2)
			System.out.println("연결전:주소값동일");

		else
			System.out.println("연결전:주소값다름");

		str1 = str1 + "&Spring";
		
		if (str1 == str2)
			System.out.println("연결후:주소값동일");
		else
			System.out.println("연결후:주소값다름");
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기:" + buf.length());
		System.out.println("기본버퍼크기:" + buf.capacity());
		
		buf.append("Java 공부중..");
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기:" + buf.length());
		System.out.println("기본버퍼크기:" + buf.capacity());
		
		buf.append("금일은 StringBuffer 학습중..!!");
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기:" + buf.length());
		System.out.println("기본버퍼크기:" + buf.capacity());
	}

}
