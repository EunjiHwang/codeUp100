import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char e = scanner.next().charAt(0);
		
		switch(e) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
		}
		
	}

}
