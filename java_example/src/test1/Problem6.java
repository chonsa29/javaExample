package test1;

public class Problem6 {
	public static void main(String[] args) {
		for(int i = 1;i<=9;i++) {
			for(int j = 1;j<=9;j++) {
				if(i != 5 && i != 8) {
					System.out.println(i+"*"+j+"="+ (i*j));
				}
			}
		}
	}
}
