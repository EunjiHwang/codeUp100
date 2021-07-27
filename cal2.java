import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.printf("%d\n"
				+ "%d\n"
				+ "%d\n"
				+ "%d\n"
				+ "%d\n", a+b, a-b, a*b, a/b, a%b);
		double c = (double)a;
		System.out.printf("%.2f", c/b);
	}

}
