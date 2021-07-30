import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long h = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();
		long s = scanner.nextLong();
		double total = 0;
		
		total = h*b*c*s;
		
		double result = ((total/8)/Math.pow(2, 10)/Math.pow(2, 10));
		System.out.format("%.1f MB", result);
	}
}
