import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); // 시작 값
		int d = scanner.nextInt(); // 등차의 값
		int n = scanner.nextInt(); // 몇 번째 수 인지를 의미하는 정수
		
		int result = a;
		
		for(int i=1; i<n; i++) {
			result += d;
		}
		
		System.out.println(result);
		
	}
}
