import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 흰 돌 갯수
		int[][] a = new int[19][19];
		
		for(int i=0; i<n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			a[x-1][y-1] = 1; // 흰 돌이 놓인 좌표의 값을 1로 변경
		}
		
		for(int i=0; i<19; i++) { // 한 줄(위에서 아래로)씩
			for(int j=0; j<19; j++) { // 한 열(왼쪽에서 오른쪽으로)씩
				System.out.printf(a[i][j] + " "); // 값 출력
			}
			System.out.println();
		}
	}
}
