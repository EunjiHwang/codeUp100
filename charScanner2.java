import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char x, y;
		
		Scanner scanner = new Scanner(System.in);
		x = scanner.next().charAt(0);
		y = scanner.next().charAt(0);
		
		System.out.printf("%c %c", y, x);
	}

}
