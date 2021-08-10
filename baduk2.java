import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] a = new int[19][19];
		
		for(int i=0; i<a.length; i++) { // �� ��(������ �Ʒ���)��
			for(int j=0; j<a.length; j++) { // �� ��(���ʿ��� ����������)��
				a[i][j] = scanner.nextInt();
			}
		}
		
		int n = scanner.nextInt();
		int x, y;
		
		for(int i=0; i<n; i++) {
			x = scanner.nextInt();
			for(int j=0; j<a.length; j++) {
				if (a[x-1][j] == 0) { // �ٵ� ���� 0�̸�
					a[x-1][j] = 1; // 1�� �ٲٰ�
				} else {
					a[x-1][j] = 0; // 1�̸� 0���� �ٲ۴�
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
