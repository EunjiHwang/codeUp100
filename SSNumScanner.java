import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String[] arr = a.split("\\-");
		
		System.out.printf("%s%s", arr[0], arr[1]);
	}

}
