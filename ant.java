import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] a = new int[10][10]; // 10*10 ũ���� �̷� ����

		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		int y = 1;
		int finish = 0;

		for(int i=1; i<a.length; i++) { // ���������� �̵�
			if(finish != 1) { // ������� �ʾҴٸ�
				for(int j=y; j<a.length; j++) {
					if(a[i][j] == 0) { // 0�̸� �̵�
						a[i][j] = 9; // ���̰� �̵��� ��θ� 9�� ǥ��
						y++; // �Ʒ��� �̵�
					} else if(a[i][j] == 2) { // ���̰� �ִ� ���̸�
						a[i][j] = 9;
						finish = 1; // �����Ѵ�
						break;
					} else {
						y = j-1; // 1�̸� �ٽ� ���� �̵�
						break;
					}
				}
			} else {
				break; // finish�� 1�̸� ����
			}
		}

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
