import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		int aLength = a.length();
		for(int i=0;i<aLength;i++)
		System.out.printf("\'%c\'\n", a.charAt(i));
	}

}
