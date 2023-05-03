package except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamException2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�Է��ϼ���! Ÿ�� �˾Ƴ��帲");
		String input = br.readLine();

		if (isInteger(input)) {
			int num = Integer.parseInt(input);
			System.out.println("�Է��� ���� �������Դϴ�: " + num);
		} else if (isDouble(input)) {
			double num = Double.parseDouble(input);
			System.out.println("�Է��� ���� �Ǽ����Դϴ�: " + num);
		} else {
			System.out.println("�Է��� ���� ���ڿ��Դϴ�: " + input);
		}
	}

	public static boolean isInteger(String s) {
		// 1
		try {

			// 2-1
			Integer.parseInt(s);
			Integer.parseInt(s);
			Integer.parseInt(s);
			// 2-2
			Integer.parseInt("this is not int");
			Integer.parseInt(s);
			// 2-3
			Integer.parseInt(s);
			return true;
			// 2-4
		} catch (NumberFormatException e) {
			// 3
			System.out.println("�̰� ���� �ƴѵ��");
		}
		System.out.println("�������� �����ɴϴ�.");
		// 4
	}

	public static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}