package ex05method;

import java.util.Scanner;

public class MethodType02_2 {
	
	static String getHakjum() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��������:");
		int kor = scanner.nextInt();
		System.out.println("��������:");
		int eng = scanner.nextInt();
		System.out.println("��������:");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		String hakjum = "";//��
		/*
		switch���� if���� ���� ���ǽ��� ����Ҽ� �����Ƿ�
		��հ��� 10���� ������ ���� ���� ������ ������ �����Ѵ�.
		99 / 10 => ���� 9
		90 / 10 => ���� 9 .. �̿Ͱ��� Ư���� �̿��Ѵ�.
		 */
		int result = (int)avg / 10;
		switch(result) {
		case 10: case 9:
			hakjum = "A����"; break;
		case 8:
			hakjum = "B����"; break;
		case 7:
			hakjum = "C����"; break;
		case 6:
			hakjum = "D����"; break;
		default:
			hakjum = "F����";
		}
		
		return hakjum;
	}

	public static void main(String[] args) {
		
		System.out.println("���� ������ "+ getHakjum() +"�̾�~!");
		
		String h = getHakjum();
		System.out.printf("����� ������ %s �Դϴ�.", h);
		

	}

}
