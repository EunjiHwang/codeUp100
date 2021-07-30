import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r = scanner.nextInt();
		int g = scanner.nextInt();
		int b = scanner.nextInt();
		int c = 0;
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<g; j++) {
				for(int k=0; k<b; k++) {
					bw.write(i +" "+ j +" "+ k + "\n");
					c++;
				}
			}
		}
		bw.write(c + "\n");
		bw.flush();
		bw.close();
	}
}
