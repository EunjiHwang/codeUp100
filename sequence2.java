import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt(); // 시작 값
		long r = scanner.nextInt(); // 등비
		long n = scanner.nextInt(); // 몇 번째인지를 나타내는 정수
		
		long result = a;
		
		for(int i=1; i<n; i++) {
			result *= r;
		}
		
		System.out.println(result);
		
	}
}
