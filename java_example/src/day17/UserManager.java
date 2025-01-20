package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Vector;

import day16.DBClass;

public class UserManager {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			// 아이디, 비밀번호, 이름, (나이)을 입력받아서 TBL_USER에 저장
			String id = "";
			boolean idFlg = true;
			while (idFlg) {
				System.out.print("아이디 : ");
				id = scan.next();
				String _id = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "'";
				ResultSet rs = stmt.executeQuery(_id);

				idFlg = rs.next();
				if (idFlg == true) {
					System.out.println("이미 존재하는 아이디입니다. 다시 입력해주세요.");
				}
				
			}

			System.out.print("비밀번호 : ");
			String pwd = scan.next();
			System.out.print("이름 : ");
			String name = scan.next();

			String sql = "INSERT INTO TBL_USER(USERID,PASSWORD,USERNAME) VALUES('" + id + "','" + pwd + "','" + name
					+ "')";

			System.out.println(sql);

			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("가입되었습니다!");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
