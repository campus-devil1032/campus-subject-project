import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputWithIntAndException {
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���.");

		int userInputNumber;
		try {
			userInputNumber = extracted();
			System.out.println("�Է¹��� ���ڿ��� " + userInputNumber + " �Դϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("������ �� �����Դϴ�.");

	}

	private static int extracted() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int userInputNumber = Integer.parseInt(str);
		return userInputNumber;
	}
}
