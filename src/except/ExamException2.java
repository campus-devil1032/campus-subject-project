package except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamException2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력하세요! 타입 알아내드림");
		String input = br.readLine();

		if (isInteger(input)) {
			int num = Integer.parseInt(input);
			System.out.println("입력한 값은 정수형입니다: " + num);
		} else if (isDouble(input)) {
			double num = Double.parseDouble(input);
			System.out.println("입력한 값은 실수형입니다: " + num);
		} else {
			System.out.println("입력한 값은 문자열입니다: " + input);
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
			System.out.println("이거 숫자 아닌디요");
		}
		System.out.println("이쪽으로 내려옵니다.");
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