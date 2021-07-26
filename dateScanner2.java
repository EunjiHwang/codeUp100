import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		
		String[] Date = date.split("\\.");
		
		int year = Integer.valueOf(Date[0]);
		int month = Integer.valueOf(Date[1]);
		int day = Integer.valueOf(Date[2]);
		
		System.out.printf("%02d-%02d-%04d", day, month, year);
		
	}

}
