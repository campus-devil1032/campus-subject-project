import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputExam {
	public static void main(String[] args) throws IOException {
		System.out.println("���ڿ��� �Է��ϼ���.");
		/*
		 * System.in �̶�� "����"�� ǥ�� �Է� ��ġ�� ���� �Ǿ� ����.
		 * 
		 * System.out �� ǥ�� ��� ��ġ�� ��ǻ�� ȭ���� �ǹ��ϰ� �ִ�.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �Ʒ� ���忡�� ������� �Է��� ��ٸ��� �ִ� ���°� �ȴ�.
		String str = br.readLine();

		System.out.println("�Է¹��� ���ڿ��� " + str + " �Դϴ�.");

	}
}
