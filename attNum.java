import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // �⼮ ��ȣ�� �θ� Ƚ��
		int[] a = new int[24];
		
		for(int i=1; i<=n; i++) { // Ƚ����ŭ �Է¹ޱ�
			int t = scanner.nextInt();
			a[t] += 1; // ����ִ� ���� 1��ŭ ���� �ٽ� ����
		}
		
		for(int i=1; i<=23; i++) {
			System.out.printf("%d ", a[i]); // 1������ ��ȣ�� �Ҹ� Ƚ���� ������� ���
		}
	}
}
