import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); // ���� ��
		int d = scanner.nextInt(); // ������ ��
		int n = scanner.nextInt(); // �� ��° �� ������ �ǹ��ϴ� ����
		
		int result = a;
		
		for(int i=1; i<n; i++) {
			result += d;
		}
		
		System.out.println(result);
		
	}
}
