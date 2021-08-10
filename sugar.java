import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt(); // �������� ����
		int h = scanner.nextInt(); // �������� ����
		int[][] a = new int[w][h];
		int n = scanner.nextInt(); // ������ ����
		
		for(int i=0; i<n; i++) {
			int l = scanner.nextInt(); // ������ ����
			int d = scanner.nextInt(); // ����
			int x = scanner.nextInt(); // x��ǥ
			int y = scanner.nextInt(); // y��ǥ
			
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
