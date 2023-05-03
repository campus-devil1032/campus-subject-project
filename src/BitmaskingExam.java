
public class BitmaskingExam {
	public static void main(String[] args) {
		// AND(&) 연산 예시
		int a = 13; // 이진수: 1101
		int b = 6; // 이진수: 0110
		int c = a & b; // 이진수: 0100, 10진수: 4
		System.out.println(c);

		// OR(|) 연산 예시
		int d = a | b; // 이진수: 1111, 10진수: 15
		System.out.println(d);

		// XOR(^) 연산 예시
		int e = a ^ b; // 이진수: 1011, 10진수: 11
		System.out.println(e);

		// NOT(~) 연산 예시
		int f = ~a; // 이진수: 0010, 10진수: -14
		System.out.println(f);

		// SHIFT 연산자
		shiftCalc();
	}

	private static void shiftCalc() {
		/*
		 * SHIFT(<<, >>, >>>) 연산자는 비트를 왼쪽 또는 오른쪽으로 이동시키는 연산자입니다.
		 * 
		 * 이동하는 거리는 연산자 뒤에 지정된 비트 수입니다.
		 * 
		 * 이 때, 왼쪽 시프트 연산자(<<)는 비트를 왼쪽으로 이동시키며, 오른쪽 시프트 연산자(>>)는 비트를 오른쪽으로 이동시킵니다.
		 * 
		 * 또한, 논리 오른쪽 시프트 연산자(>>>)는 비트를 오른쪽으로 이동시키며, 왼쪽 빈 자리를 항상 0으로 채웁니다.
		 */
		int a = 60; // 이진수: 0011 1100
		int b = -60; // 이진수: 1111 1100
		int c = 13; // 이진수: 0000 1101

		// 왼쪽 시프트 연산자(<<) 예시
		int d = a << 2; // 이진수: 1111 0000, 10진수: -16
		System.out.println(d);

		// 오른쪽 시프트 연산자(>>) 예시
		int e = a >> 2; // 이진수: 0000 1111, 10진수: 15
		System.out.println(e);

		// 논리 오른쪽 시프트 연산자(>>>) 예시
		int f = b >>> 2; // 이진수: 0011 1111, 10진수: 63
		System.out.println(f);

		// 왼쪽 시프트 연산자(<<)와 OR(|) 연산자를 사용한 예시
		int g = c << 3 | 7; // 이진수: 1101 0011, 10진수: 211
		System.out.println(g);
	}
}
