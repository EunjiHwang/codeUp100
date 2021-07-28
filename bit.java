import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = ~a; // ~ 비트 반전 연산자
		
		System.out.println(b);
	}

}
