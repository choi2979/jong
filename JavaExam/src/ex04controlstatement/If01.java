package ex04controlstatement;

import java.io.IOException;

public class If01 {
	/*
	if��(���ǹ�, �нù�)
		����1
			if(���ǹ�){
				���๮1;
				���๮2;
			}
		-if���� ���ǹ��� �ݵ�� �񱳽� Ȥ�� �����̾�� �Ѵ�.
		-�� ������� booleanŸ��(true, false)�̾�� �Ѵ�.
		-������ ������ �ϳ��϶��� �߰�ȣ ������ �����ϴ�.
	 */

	public static void main(String[] args) throws IOException {
		
		int num = 10;
		
		//�Ʒ� ������ ���ǽ��� boolean�� �ƴ� ������̹Ƿ� �����߻�
//		if(num%2) {
//			System.out.println("�߸��� ���ǽ��Դϴ�.");
//		}
//		if(num) {
//			System.out.println("�̰͵� �߸��� ���ǽ��Դϴ�.");
//		}
		
		//if���� ������ �Ʒ��Ͱ��� boolean���� ��ȯ�ϴ� ���ǽ��̾�� �Ѵ�.
		if(num%2==0) {
			System.out.printf("%d�� ¦���Դϴ�.", num);
		}
		if(num%2==0 && num>=10) {
			System.out.printf("%n%d�� ¦���̰� 10���� ũ�ų� ����.%n", num);
		}
		
		//��쿡 ���� ������ ����Ǵ� if���� �ʿ���.
		if(true) {
			System.out.println("������ ����Ǵ� if���Դϴ�.");
		}
		/*
		if(���ǽ�); => ���ǽĿ� ������� ���� ������ ����ȴ� ���·�
			�����ݷ��� ������ ���� ��Ÿ���Ƿ� ��뿡 �����ؾ� �Ѵ�.
		 */
		if(num%2 != 0); {
			System.out.printf("%d�� Ȧ���Դϴ�.", num);
		}
		
		/*
		���ǰ˻��� ������ ������ �ϳ��� ��쿡�� {}�߰�ȣ��
		�����Ҽ� �ִ�. ��, ���๮�� 2�� �̻��� ��쿡�� �ѹ��常
		����ǹǷ� �ǵ�ġ���� ����� ���ü� �����Ƿ� �����ؾ��Ѵ�.
		 */
		if(num%2 == 0)
			System.out.println("\n"+ num +"�� ¦���̴�");
		
		if(num%2 != 0) {
			System.out.println("num�� "+ num +"�Դϴ�.");
			System.out.println(num +"�� Ȧ���Դϴ�.");
		}
		/*
		System.in.read()
			: ������ְ� �ϳ��� ���ڸ� �Է¹����� ����ϴ� �޼ҵ��
			�Է��� ������ �ƽ�Ű�ڵ尪�� ��ȯ�Ѵ�.
			�ش� �Լ��� �⺻������ IOExceotion ���ܸ� ������ �־
			�����ϱ� ���� main()�Լ����� throws�Ѵ�.
		 */
		/*System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ�:");
		int asciiCode = System.in.read();
		System.out.println("����ڰ� �Է��� ������ �ƽ�Ű�ڵ尪:"+ asciiCode);
		System.out.println("����ڰ� �Է��� ����:"+ (char)asciiCode);
		*/
		/*
		�ó�����] ����ڰ� �Է��� ���ڰ� �������� �Ǵ��ϴ�
		���α׷��� �ۼ��Ͻÿ�.
		 */
		System.out.print("���� �ϳ��� �Է��ϼ���:");
		int ascii = System.in.read();
		/*
			'0'�� �ƽ�Ű�ڵ� : 48
			'9'�� �ƽ�Ű�ڵ� : 57
			��, �ش� �� ���̿� �ִٸ� ���ڷ� �Ǵ��Ҽ� �ִ�.		 
		*/
		//�ƽ�Ű�ڵ尪�� �˰� ���� ��
		if(ascii>=48 && ascii<=57) {
			System.out.println("�Է��� ���ڴ� �����Դϴ�");
		}
		else {
			System.out.println("�Է��� ���ڴ� ���ڰ� �ƴմϴ�.");
		}
		/*
		���ڴ� ���������� �ƽ�Ű�ڵ�� ����ǹǷ� �Ʒ��� ���� �񱳿�����
		�����ϴ�. ���� ������굵 �����ϴ�.
		 */
		//�ƽ�Ű�ڵ尪�� �� ��
		boolean isNumber = (ascii>='0' && ascii<= '9');
		if(isNumber) {
			System.out.println("�Է��� ���ڴ� �����Դϴ�.");
		}
		else {
			System.out.println("�Է��� ���ڴ� ���ڰ� �ƴմϴ�.");
		}
	}

}
