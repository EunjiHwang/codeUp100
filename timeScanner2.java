import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time = scanner.next();
		
		String[] Time = time.split("\\:");
		int m = Integer.parseInt(Time[1]);
		
		if(m <= 9) {
			System.out.printf("%1d", m);
		} else {
			System.out.printf("%d", m);
		}
		
	}

}
