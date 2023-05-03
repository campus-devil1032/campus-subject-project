package org.example;


/**
 * �ڹ� Ŭ������ ��ü�� �����ϴµ� ���Ǵ� ���赵�� ���� ���Դϴ�.
 * ��ü�� Ŭ������ �ν��Ͻ��Դϴ�.
 * Ŭ������ ������ ���� �Ϲ������� �ʵ�� �޼��带 �����մϴ�.
 * �ʵ�� Ŭ������ ������ ����Դϴ�. �ʵ�� Ŭ������ ����� �����͸� ��Ÿ���ϴ�.
 * ���� ���, Person Ŭ�������� �̸�, ����, ���� ��� ���� �ʵ尡 ���� �� �ֽ��ϴ�.
 * "�޼���"�� Ŭ������ ���ǵ� �Լ��Դϴ�.
 * �̰͵��� Ŭ�������� ������ �� �ִ� �۾��� �����մϴ�.
 * ���� ���, Person Ŭ�������� �̸��� ����ϰų� ���̸� ����ϴ� �޼��尡 ���� �� �ֽ��ϴ�.
 */
public class PersonDto {
    private String name;
    private int age;

    /**
     * �����ڴ� Ŭ������ �̿��ؼ� ��ü�� ���� �� �� ���� �ѹ� �ҷ����� �Ǵ� Ư���� �޼����Դϴ�.
     * �����ڴ� Ŭ������ �̸��� ������ �̸��� ������, ��ȯ ������ �����ϴ�.
     * �����ڴ� �ַ� Ŭ������ �ʵ带 "�ʱ�ȭ"�ϴµ� ��� �˴ϴ�.
     *
     * @param name �� Ŭ�������� ��� �� "�̸�"�� �ش��ϴ� ���Դϴ�
     * @param age  �� Ŭ�������� ��� �� "����"�� �ش��ϴ� ���Դϴ�
     */
    public PersonDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}