import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // �� �� ����
		int[][] a = new int[19][19];
		
		for(int i=0; i<n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			a[x-1][y-1] = 1; // �� ���� ���� ��ǥ�� ���� 1�� ����
		}
		
		for(int i=0; i<19; i++) { // �� ��(������ �Ʒ���)��
			for(int j=0; j<19; j++) { // �� ��(���ʿ��� ����������)��
				System.out.printf(a[i][j] + " "); // �� ���
			}
			System.out.println();
		}
	}
}
