import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong(); // ���� ��
		long m = scanner.nextLong(); // ���� ��
		long d = scanner.nextLong(); // ���� ��
		long n = scanner.nextLong(); // �� ��°������ ��Ÿ���� ����
		
		long result = a;
		
		for(int i=1; i<n; i++) {
			result = (result * m) + d;
		}
		
		System.out.println(result);
		
	}
}
