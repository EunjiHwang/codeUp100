import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // �⼮ ��ȣ�� �θ� Ƚ��
		ArrayList<Integer> list = new ArrayList<>(); // int Ÿ�Ը� ��� ������ ArrayList ����
		
		for(int i=0; i<n; i++) { // Ƚ����ŭ �Է¹ޱ�
			int t = scanner.nextInt();
			list.add(t); // �� �߰�
		}
		
		System.out.println(Collections.min(list)); // �ּڰ�
	}
}
