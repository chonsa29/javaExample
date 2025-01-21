package day18;

public class ASDF {

	public static void main(String[] args) {
		char c = 'a';
		int i = 0;
		while (true) {
			int j = 0;
			while (j < 5) {
				System.out.printf("%c ",c+j);

				j++;
				if(c == 'z') return;
			}
			System.out.println();
			i++;
		}

	}
	
}
