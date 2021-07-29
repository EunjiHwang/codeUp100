import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char alphabet = scanner.next().charAt(0);
		char a = 'a';
		
		do {
			System.out.printf("%c ", a);
			a++;
		} while (a <= alphabet);
		
	}
}
