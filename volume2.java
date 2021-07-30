import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double w = scanner.nextInt();
		double h = scanner.nextInt();
		double b = scanner.nextInt();
		
		double result = (w*h*b) / 8 / 1024 / 1024;
		System.out.printf("%.2f MB", result);
	}
}
