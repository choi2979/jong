package ex05method;
/*
����5-2) ���ϸ� : QuCircleCalculator.java (���̵�:��)
���� �������� �Ķ��Ÿ�� �����ϸ� ���ǳ��̿� �ѷ��� ����Ͽ� ��ȯ�ϴ� �޼ҵ带 ���� ��������. �̸� ȣ���ϴ� main �޼ҵ带 �����϶�.
�޼ҵ�� : circleArea() > ���ǳ���, circleRound() > ���ǵѷ�
-���̰��� : 3.14 * ������ * ������
-�ѷ����� : 2 * 3.14 * ������
���࿹ :
---------- java ----------
���� �ѷ�(5.5) : 34.54
���� ����(5.5) : 94.985
 */

import java.util.Scanner;

public class QuCircleCalculator {
	
	static double circleRound(int rad) {
		
		return 2 * 3.14 * rad;
	}
	
	static double circleArea(int rad) {
		
		double result = 3.14 * rad * rad;
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("�������� �Է��ϼ���:");
		Scanner scan = new Scanner(System.in);
		int radian =scan.nextInt();
		
		System.out.println("���ǳ���:"+ circleArea(radian));
		System.out.println("���ǵѷ�:"+ circleRound(radian));

	}

}
