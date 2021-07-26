import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		char[] arr = a.toCharArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+arr[i]);
			for(int j=arr.length-1; j>i; j--) {
				System.out.print("0");
			}
			System.out.print("]\n");
		}
	}

}
