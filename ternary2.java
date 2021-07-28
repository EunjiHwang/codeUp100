import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		// 조건식 ? (참일 때의 값) : (거짓일 때의 값)
		// a>b ? b:a (a,b 중에 작은 값) ? a>b ? b:a (a,b 중에 작은 값)
		// c > (a,b 중에 작은 값) ? (a,b중에 작은 값) : c
		// c가 a,b중에 작은 값보다 큰게 참이면 a,b중에 작은 값 출력
		// c가 a,b중에 작은 값보다 큰게 거짓이면 c 출력
		System.out.println(c > (a>b ? b:a) ? (a>b ? b:a) : c);
	}

}
