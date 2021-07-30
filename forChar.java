import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char a;
		
		while(true) {
			a = scanner.next().charAt(0);
			if(a=='q') {
				System.out.println(a);
				break;
			}
			System.out.println(a);
		}
	}
}
