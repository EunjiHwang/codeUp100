import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		
		int b = Integer.valueOf(a, 16);
		System.out.printf("%o", b);
	}

}
