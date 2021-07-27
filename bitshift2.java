import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		// 비트연산자 <<는 2배씩 늘어나고 >>는 반으로 줄어든다
		System.out.printf("%d", a<<b); // a의 b배 값이 출력
	}

}
