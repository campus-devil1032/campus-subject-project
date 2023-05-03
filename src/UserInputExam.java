import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputExam {
	public static void main(String[] args) throws IOException {
		System.out.println("문자열을 입력하세요.");
		/*
		 * System.in 이라는 "문장"은 표준 입력 장치와 연결 되어 있음.
		 * 
		 * System.out 은 표준 출력 장치인 컴퓨터 화면을 의미하고 있다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 아래 문장에서 사용자의 입력을 기다리고 있는 상태가 된다.
		String str = br.readLine();

		System.out.println("입력받은 문자열은 " + str + " 입니다.");

	}
}
