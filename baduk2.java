import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] a = new int[19][19];
		
		for(int i=0; i<a.length; i++) { // 한 줄(위에서 아래로)씩
			for(int j=0; j<a.length; j++) { // 한 열(왼쪽에서 오른쪽으로)씩
				a[i][j] = scanner.nextInt();
			}
		}
		
		int n = scanner.nextInt();
		int x, y;
		
		for(int i=0; i<n; i++) {
			x = scanner.nextInt();
			for(int j=0; j<a.length; j++) {
				if (a[x-1][j] == 0) { // 바둑 돌이 0이면
					a[x-1][j] = 1; // 1로 바꾸고
				} else {
					a[x-1][j] = 0; // 1이면 0으로 바꾼다
				}
			}
			y = scanner.nextInt();
			for(int k=0; k<a.length; k++) {
				if (a[k][y-1] == 0) {
					a[k][y-1] = 1;
				} else {
					a[k][y-1] = 0;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.printf(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
