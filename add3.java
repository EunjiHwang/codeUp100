import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			sum+=i;
			if(sum >= n) {
				System.out.println(i);
				break;
			}
		}
	}
}
