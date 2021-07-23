import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String[] b = a.split("\\.");
		System.out.printf("%s\n%s", b[0], b[1]);
	}

}
