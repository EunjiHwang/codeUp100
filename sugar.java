import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt(); // 격자판의 가로
		int h = scanner.nextInt(); // 격자판의 세로
		int[][] a = new int[w][h];
		int n = scanner.nextInt(); // 막대의 개수
		
		for(int i=0; i<n; i++) {
			int l = scanner.nextInt(); // 막대의 길이
			int d = scanner.nextInt(); // 방향
			int x = scanner.nextInt(); // x좌표
			int y = scanner.nextInt(); // y좌표
			
			if(d == 0) {
				for(int j=y; j<y+l; j++) {
					a[x-1][j-1] = 1;
				}
			} else {
				for(int j=x; j<x+l; j++) {
					a[j-1][y-1] = 1;
				}
			}
		}
		
		for(int i=0; i<w; i++) {
			for(int j=0; j<h; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
