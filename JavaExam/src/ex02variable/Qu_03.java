package ex02variable;
/*
����3] ���ϸ� : Qu_03.java
�������� 10�� ���� ���̸� ���� ����Ͻÿ�.
��, ����� Ÿ���� int, float, double��
�������� �����Ͽ� ���� ����ؾ��Ѵ�.
������] 
	int�� : area_int
	float�� : area_float
	double�� : area_double
����]
	���ǳ��� = ������ * ������ * 3.14
 */
public class Qu_03 {

	public static void main(String[] args) {
		
		int h = 10;// ������ rad
		double pi = 3.14;// ���
		int area_int = (int)(h * h * pi);
		float area_float = (float)(h * h * pi);
		double area_double = h * h * pi;
		
		System.out.println(area_int);
		System.out.println(area_float);
		System.out.println(area_double);
		

	}

}
