import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=1;
		
		while(true) {
			n = scanner.nextInt();
			if(n == 0) {
			break;
			}
			System.out.println(n);
		}
	}
}