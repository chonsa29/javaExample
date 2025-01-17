package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBInsertEx1 {
	public static void printData(ResultSet rs) throws SQLException {

		while (rs.next()) {
			String name = rs.getString("STU_NAME");
			int height = rs.getInt("STU_HEIGHT");

			System.out.print(name + "\t");
			System.out.println(height);

		}

	}

	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();

			//학번(String 8글자), 이름, 학과를 입력받아서 STUDENT 테이블에 저장
			
			System.out.print("학번 입력 : ");
			String STU_NO = scan.next();
			System.out.print("이름 입력 : ");
			String STU_NAME = scan.next();
			
			int num = stmt.executeUpdate("INSERT INTO STUDENT(STU_NO, STU_NAME) VALUES ('" + STU_NO + "'," + "'" + STU_NAME + "')" );
			if(num == 0) System.out.println("삽입 실패");
			else System.out.println("삽입 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
