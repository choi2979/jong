package ex04controlstatement;

public class If03 {
	/*
	if��(���ǹ�, �б⹮)
	����3]
		if(���ǹ�1){
			���๮��1;
		}
		else if(���ǹ�2)[
			���๮��2;
		}
		else {
			�� ��� ���ǽ��� �����϶� ������ ����;
		}
		��else������ ���ǽ��� �� �� ����.
	 */
	public static void main(String[] args) {
		
		/*
		�ó�����] ��, ��, �� ������ ��հ��� ���Ͽ� ������
		����ϴ� ���α׷��� �ۼ��Ͻÿ�. 90���̻��� A����...
		60�� �̸��� F�������� �Ǵ��Ѵ�.
		 */
		int kor=99, eng=70, math=64;
		double avg = (kor+eng+math) / 3.0;
		System.out.println("���������(�״��):"+ avg);
		System.out.printf("���������(�Ҽ�2�ڸ�):%.2f\n", avg);
		if(avg>=90) {
			System.out.println("A����");
		}
		else if(avg>=80) {
			System.out.println("B����");
		}
		else if(avg>=70) {
			System.out.println("C����");
		}
		else if(avg>=60) {
			System.out.println("D����");
		}
		else {
			System.out.println("F����. �л���̤�;");
	}
	/*
	if~else ������ �����Ҷ��� ������ ������ ��� �����ϴ��Ŀ� ����
	���� �ٸ� ����� ���ü� �����Ƿ� �����ؾ� ����.
	�Ʒ� ������ ���� ������ ������ 60�� �̻��� ���ǿ� �����ϹǷ�
	������ D������ ��µǰ� �ȴ�.
	if(avg>=60) {
		System.out.println("D����");
	}
	else if(avg>=70) {
		System.out.println("C����");
	}
	else if(avg>=80) {
		System.out.println("B����");
	}
	else if(avg>=90) {
		System.out.println("A����");
	}
	else {
		System.out.println("F����. �л���̤�;");
	}*/
}
}
