package ex02variable;
/*
����2] ���ϸ� : Qu_02.java
����,����,���� ������ 99, 80, 96������ �Է��ϰ� 
��������� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
��°��]
	99��,80��,96���� ��������� XXX.XX���Դϴ�.(�Ǽ�����)
	99��,80��,96���� ��������� XXX���Դϴ�.(��������)
 */
public class Qu_02 {

	public static void main(String[] args) {
		
		int kor = 99, eng = 80, math = 96;
		
		double avg_d = (kor + eng + math) / 3.0;
		int avg_i = (kor + eng + math) / 3;
		
		System.out.println(kor+"��,"+eng+"��,"+math+"���� ��������� " +avg_d+"���Դϴ�.");
		System.out.println(kor+"��,"+eng+"��,"+math+"���� ��������� " +avg_i+"���Դϴ�.");
		

	}

}
