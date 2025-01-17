package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentManager {
	static Scanner scan = new Scanner(System.in);

	static String setNo() {
		String no = scan.next();
		while (no.length() != 8) {
			System.out.print("학번은 8글자 입니다 : ");
			no = scan.next();
		}
		return no;
	}

	public static void main(String[] args) {
		try {
			DBClass db = new DBClass();
			Statement stmt = db.stmt;

			while (true) {
				System.out.print("[(1) 학생추가 (2) 수정 (3) 삭제 (4) 조회 (5) 종료] : ");
				int menu = scan.nextInt();

				if (menu == 1) {
					System.out.print("학번 입력 : ");
					String STU_NO = setNo();
					System.out.print("이름 입력 : ");
					String STU_NAME = scan.next();
					System.out.print("학과 입력 : ");
					String STU_DEPT = scan.next();

					int num = stmt.executeUpdate("INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) VALUES ('" + STU_NO
							+ "','" + STU_NAME + "','" + STU_DEPT + "')");
					if (num == 0)
						System.out.println("삽입 실패");
					else
						System.out.println("삽입 성공");
				} else if (menu == 2) {
					System.out.print("학번 입력 : ");
					String STU_NO = scan.next();

					ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NO = " + "'" + STU_NO + "'");
					if (rs.next()) {
						System.out.print("수정할 데이터 선택 : ");
						System.out.print("(1) 이름 (2) 학과 (3) 키 =>");
						int column = scan.nextInt();

						if (column == 1) {
							System.out.print("이름 변경 : ");
							String STU_NAME = scan.next();

							int num = stmt.executeUpdate("UPDATE STUDENT SET STU_NAME = '" + STU_NAME + "' WHERE STU_NO = '" + STU_NO + "'");
							
						} else if (column == 2) {
							System.out.print("학과 변경 : ");
							String STU_DEPT = scan.next();
							int num = stmt.executeUpdate("UPDATE STUDENT SET STU_DEPT = '" + STU_DEPT + "' WHERE STU_NO = '" + STU_NO + "'");
						} else if (column == 3) {
							System.out.print("키 변경 : ");
							int STU_HEIGHT = scan.nextInt();
							int num = stmt.executeUpdate("UPDATE STUDENT SET STU_DEPT = '" + STU_HEIGHT + "' WHERE STU_NO = '" + STU_NO + "'");
						} else {
							System.out.println("없는 메뉴입니다.");
						}
					} else {
						System.out.println("해당 학번을 가진 학생 없음");
					}
				} else if (menu == 3) {
					System.out.print("삭제할 학생의 이름 입력 : ");
					String name = scan.next();

					System.out.println("DELETE FROM STUDENT WHERE STU_NAME =" + "'" + name + "'");

					int num = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NAME = " + "'" + name + "'");
					if (num == 0) {
						System.out.println("삭제할 대상이 존재 하지 않습니다.");
					} else {
						System.out.println("삭제되었습니다.");
					}
				} else if (menu == 4) {
					System.out.println();
				} else if (menu == 5) {
					System.out.println("종료합니다.");
					break;
				} else {
					System.out.println("없는 메뉴입니다.");
				}
			}

		} catch (Exception e) {

		}
	}
}
