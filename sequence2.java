import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt(); // ���� ��
		long r = scanner.nextInt(); // ���
		long n = scanner.nextInt(); // �� ��°������ ��Ÿ���� ����
		
		long result = a;
		
		for(int i=1; i<n; i++) {
			result *= r;
		}
		
		System.out.println(result);
		
	}
}
