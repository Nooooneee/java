package ex21jdbc.connect;

/*
인터페이스에 선언되는
	모든 변수는 public static final이 추가되어 정정상수가 된다.
	모든 메서드는 public abstract가 추가되어 추상메서드가 된다.
*/
public interface IConnect 
{
	// 멤버변수 : 오라클 드라이브명과 커넥션 URL을 선언
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
 
	// 멤버 추상 메서드
	void connect(String user, String pass);		// DB연결	
	void execute();		// 쿼리문 실행
	void close();		// 자원반납
	// 사용자로부터 입력을 받기위해 정의
	String scanValue(String title);
}
