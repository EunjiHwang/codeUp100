import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 출석 번호를 부를 횟수
		ArrayList<Integer> list = new ArrayList<>(); // int 타입만 사용 가능한 ArrayList 선언
		
		for(int i=0; i<n; i++) { // 횟수만큼 입력받기
			int t = scanner.nextInt();
			list.add(t); // 값 추가
		}
		
		Collections.reverse(list); // 배열을 역순으로 바꿈
		
		for(int i=0; i<list.size(); i++) { // list.size() = list 크기
			System.out.printf(list.get(i) + " "); // list의 i index값 리턴
		}
	}
}
