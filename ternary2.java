import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		// ���ǽ� ? (���� ���� ��) : (������ ���� ��)
		// a>b ? b:a (a,b �߿� ���� ��) ? a>b ? b:a (a,b �߿� ���� ��)
		// c > (a,b �߿� ���� ��) ? (a,b�߿� ���� ��) : c
		// c�� a,b�߿� ���� ������ ū�� ���̸� a,b�߿� ���� �� ���
		// c�� a,b�߿� ���� ������ ū�� �����̸� c ���
		System.out.println(c > (a>b ? b:a) ? (a>b ? b:a) : c);
	}

}
