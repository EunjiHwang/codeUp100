import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 출석 번호를 부를 횟수
		int[] a = new int[24];
		
		for(int i=1; i<=n; i++) { // 횟수만큼 입력받기
			int t = scanner.nextInt();
			a[t] += 1; // 들어있던 값에 1만큼 더해 다시 저장
		}
		
		for(int i=1; i<=23; i++) {
			System.out.printf("%d ", a[i]); // 1번부터 번호가 불린 횟수를 순서대로 출력
		}
	}
}
