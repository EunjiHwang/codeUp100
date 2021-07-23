import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String[] arr = a.split("\\.");
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month, day);
	}

}
