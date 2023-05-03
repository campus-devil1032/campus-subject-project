import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputWithIntAndException {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요.");

		int userInputNumber;
		try {
			userInputNumber = extracted();
			System.out.println("입력받은 문자열은 " + userInputNumber + " 입니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("에러가 난 상태입니다.");

	}

	private static int extracted() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int userInputNumber = Integer.parseInt(str);
		return userInputNumber;
	}
}
