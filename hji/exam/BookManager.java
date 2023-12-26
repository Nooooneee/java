package exam;

import ex21jdbc.connect.IConnectImpl;
import java.util.Scanner;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

public class BookManager extends IConnectImpl {

	Scanner scan = new Scanner(System.in);

	int bookNum = 1;
	int memNum = 1;
	int checkoutNum = 1;

	public BookManager() {
		super("hr", "1234");
	}

	public void UpdateSQL() {

	}

	public void Run() {
		Init();
		while (true) {
			ShowMenu();
			switch (scan.nextInt()) {
			case 1:
				AddBook();
				break;
			case 2:
				DeleteBook();
				break;
			case 3:
				SelectBook();
				break;
			case 4:
				SelectAllBook();
				break;
			case 5:
				AddMem();
				break;
			case 6:
				SelectMem();
				break;
			case 7:
				CheckOutBook();
				break;
			case 8:
				CheckInBook();
				break;
			case 9:
				close();
				System.exit(0);
			}
		}
	}

	public void ShowMenu() {
		System.out.println("-------------------------");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 삭제");
		System.out.println("3. 도서 조회");
		System.out.println("4. 도서 전체 조회");
		System.out.println("5. 회원 등록");
		System.out.println("6. 회원 조회");
		System.out.println("7. 도서 대여");
		System.out.println("8. 도서 반납");
		System.out.println("9. 종료");
		System.out.println("-------------------------");
		System.out.println("");
		
		System.out.println("번호 입력 : ");
	}

	public void Init() {
		try {
			String sql = "select idx from tb_book";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {

				if(rs.getInt(1)>=bookNum)bookNum = rs.getInt(1) + 1;
			}

			sql = "select * from tb_member";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				if(rs.getInt(1)>=memNum) memNum = rs.getInt(1) + 1;
			}

			sql = "select * from tb_checkout";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				if(rs.getInt(1)>=checkoutNum) checkoutNum= rs.getInt(1) + 1;
			}
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

	public void DeleteBook() {
		System.out.println("-------------------------");
		System.out.println("도서 삭제");
		System.out.println("도서 이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		try {
			String sql = "delete from tb_book where book_name = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			System.out.println("삭제 되었습니다.");

		} catch (Exception e) {
			System.out.println("처리 실패 : 대여중인 도서입니다.");
			//e.printStackTrace();
		}
	}

	public void SelectBook() {
		System.out.println("-------------------------");
		System.out.println("도서 조회");
		System.out.println("도서 이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		try {
			String sql = "select * from tb_book where book_name = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int idx = rs.getInt(1);
				String na = rs.getString(2);
				int vol = rs.getInt(3);
				System.out.printf("%s %s %s", idx, na, vol);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("처리 실패");
			//e.printStackTrace();
		}
	}

	public void SelectAllBook() {
		try {
			String sql = "select * from tb_book";

			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int idx = rs.getInt(1);
				String name = rs.getString(2);
				int vol = rs.getInt(3);
				System.out.printf("%s %s %s", idx, name, vol);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("처리 실패");
			//e.printStackTrace();
		}
	}

	public void AddBook() {
		System.out.println("-------------------------");
		System.out.println("도서 등록");
		System.out.println("도서 이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("도서 수량 : ");
		int vol = scan.nextInt();
		try {
			String sql = "insert into tb_book values(?, ?, ?)";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, bookNum++);
			psmt.setString(2, name);
			psmt.setInt(3, vol);
			psmt.executeQuery();
//        }

			System.out.println("등록 되었습니다.");

		} catch (Exception e) {
			System.out.println("처리 실패");
			//e.printStackTrace();
		}
	}

	public void AddMem() {
		System.out.println("-------------------------");
		System.out.println("회원 등록");
		String id;
		String sql;
		try {
			while (true) {
				scan.nextLine();
				System.out.println("ID입력 : ");
				id = scan.nextLine();

				sql = "select * from tb_member where mem_id = ?";
				psmt = con.prepareStatement(sql);
				psmt.setString(1, id);
				rs = psmt.executeQuery();
				if (rs.next()) {
					System.out.println("사용하고 있는 ID입니다.");
					System.out.println("다시 입력해주세요.");
				} else
					break;
			}
			System.out.println("이름 : ");
			String name = scan.nextLine();
			sql = "insert into tb_member values(?, ?, ?,0)";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, memNum++);
			psmt.setString(2, id);
			psmt.setString(3, name);
			psmt.executeQuery();

			System.out.println("등록 되었습니다.");
		} catch (Exception e) {
			System.out.println("처리 실패");
			e.printStackTrace();
		}
	}

	public void SelectMem() {
		try {
			String sql = "select * from tb_member";

			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int idx = rs.getInt(1);
				String id = rs.getString(2);
				String name = rs.getString(3);
				String black= rs.getString(4);
				System.out.printf("%s %s %s %s", idx, id, name, black);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("처리 실패");
			//e.printStackTrace();
		}
	}
	public void CheckOutBook() {
		System.out.println("-------------------------");
		System.out.println("도서 대여");
		System.out.println("대여 할 도서 번호 : ");
		int num = scan.nextInt();
		System.out.println("회원 ID : ");
		scan.nextLine();
		String name = scan.nextLine();
		try {
			String sql = "select BOOK_VOLUME from TB_BOOK where IDX = ?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			if (rs.next()) {
				if (rs.getInt(1) > 0) {
					LocalDate odate = LocalDate.now();
					LocalDate idate = odate.plusWeeks(1);
					sql = "insert into tb_checkout values(?, ?, ?, ?, ?)";
					psmt = con.prepareStatement(sql);
					psmt.setInt(1, checkoutNum++);
					psmt.setInt(2, num);
					psmt.setString(3, name);
					psmt.setDate(4, java.sql.Date.valueOf(odate));
					psmt.setDate(5, java.sql.Date.valueOf(idate));
					psmt.executeQuery();

					System.out.println("대여 되었습니다.");

					sql = "update tb_book set book_volume = book_volume-1  where idx = ?";
					psmt = con.prepareStatement(sql);
					psmt.setInt(1, num);
					psmt.executeUpdate();
				} else
					System.out.println("도서 수량이 부족합니다.");
			} else
				System.out.println("입력한 정보가 잘못 되었습니다.");

		} catch (Exception e) {
			System.out.println("처리 실패");
			//e.printStackTrace();
		}
	}

	public void CheckInBook() {
		System.out.println("-------------------------");
		System.out.println("도서 반납");
		System.out.println("반납 할 도서 번호 : ");
		int num = scan.nextInt();
		System.out.println("회원 ID : ");
		scan.nextLine();
		String id = scan.nextLine();
		try {
			String sql = "delete from tb_checkout where book_num = ? and CHECKOUT_MEM_ID = ?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setString(2, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				System.out.println("반납 되었습니다.");
				sql = "update tb_book set book_volume = book_volume + 1 where idx = ?";
				psmt = con.prepareStatement(sql);
				psmt.setInt(1, num);
				psmt.executeUpdate();
			} else
				System.out.println("입력한 정보가 잘못 되었습니다.");

		} catch (Exception e) {
			System.out.println("처리 실패");
			//e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (con != null)
				con.close();
			if (psmt != null)
				psmt.close();
			if (rs != null)
				rs.close();

			if (stmt != null)
				stmt.close();
			if (csmt != null)
				csmt.close();
			//System.out.println("자원 반납 완료");
		} catch (Exception e) {
			System.out.println("자원 반납시 오류발생");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BookManager b = new BookManager();
		b.Run();
	}

}
