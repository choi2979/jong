package ex05method;
/*
����5-3) ���ϸ� : QuTemperature.java  (���̵�:��)
����(Celsius)�� �Է¹޾Ƽ� ȭ��(Fahrenheit)�� ��ȯ�Ͽ� �����ϴ� �Լ���
ȭ���� �Է¹޾Ƽ� ������ ��ȯ�Ͽ� �����ϴ� �Լ��� ������.
����]
  ȭ�� = 1.8 * ���� + 32
  ���� = (ȭ�� - 32) / 1.8
 */

public class QuTemperature {
	
	static double CelsiusToFahrenheit(int cel) {
		
		return 1.8 * cel + 32;
	}
	
    static double FahrenheitToCelsius(int fah) {
    	
    	double cel = (fah - 32) / 1.8;
    	return cel;
    }

	public static void main(String[] args) {
		
		System.out.println("����22->ȭ��");
		System.out.println(CelsiusToFahrenheit(22));
		System.out.println("ȭ��98->����");
		System.out.println(FahrenheitToCelsius(98));
		

	}

}
