import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		
		int b = Integer.valueOf(a, 8);
		System.out.printf("%d", b);
	}

}
