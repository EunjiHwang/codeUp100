import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong(); // 시작 값
		long m = scanner.nextLong(); // 곱할 값
		long d = scanner.nextLong(); // 더할 값
		long n = scanner.nextLong(); // 몇 번째인지를 나타내는 정수
		
		long result = a;
		
		for(int i=1; i<n; i++) {
			result = (result * m) + d;
		}
		
		System.out.println(result);
		
	}
}
