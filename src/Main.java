

public class Main {

	public static void main(String[] args) {

		/*
		 * ~~ �ڵ��� ���� ���μ��� ����~~
		 */

		Car carObject = new Car(1000, "ModelY");
		carObject.setFactoryName("123");
		System.out.println(carObject.getFactoryName());

		/*
		 * ~~ �ڵ��� ���� ���μ��� ����~~
		 */
//
//		PersonDto person = new PersonDto("John Doe", 30);
//		System.out.println("Name: " + person.getName());
//		System.out.println("Age: " + person.getAge());
//		person.setName("Jane Doe");
//		person.setAge(35);
//		System.out.println("Name: " + person.getName());
//		System.out.println("Age: " + person.getAge());

	}
}