package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserUpdate {
	public static void main(String[] args) {
		// 아이디를 입력받아서 없는 아이디면 다시 입력하도록 있는 아이디일 경우 나이 값을 입력받아서 업데이트
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;

			System.out.print("아이디 : ");
			String id = scan.next();

			String sql = "SELECT * FROM TBL_USER WHERE USERID ='" + id + "'";
			ResultSet rs = stmt.executeQuery(sql);

			boolean exists = true;
			if (rs.next()) {
				System.out.print("나이 : ");
				int age = scan.nextInt();
				int num = stmt.executeUpdate("UPDATE TBL_USER SET AGE = " + age + "WHERE USERID = '" + id + "'");
				if (num > 0) {
					System.out.println("나이가 입력되었습니다.");
				} else {
					System.out.println("입력 오류");
				}
			} else {
				while (exists) {
					System.out.print("없는 아이디입니다.\n아이디 : ");
					id = scan.next();
					rs = stmt.executeQuery(sql);
					exists = rs.next();
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
