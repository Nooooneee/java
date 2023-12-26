package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery 
{
	// 멤버변수
	Connection con; 	// DB연결을 위한 객체
	Statement stmt; 	// 정적 쿼리문을 전송 및 실행하기 위한 객체
	
	// 생성자
	public InsertQuery() {
	}//end of InsertQuery
	
	// DB 자원 해제
	private void close() {
	}//end of close
	
	// 쿼리작성 및 전송, 실행을 위한 메서드
	private void execute()	{

	} 

	public static void main(String[] args) {

	}//end of main
}
