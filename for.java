import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] m = new int[n];
		
		for(int i=0; i<m.length; i++) {
			m[i] = scanner.nextInt();
		}
		for(int i=0; i<m.length; i++) {
			System.out.println(m[i]);
		}
	}
}
