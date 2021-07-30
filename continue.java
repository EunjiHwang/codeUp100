import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%3==0) continue; // continue => 아래 부분은 건너뛰고 계속
			System.out.println(i);
		}
	}
}
