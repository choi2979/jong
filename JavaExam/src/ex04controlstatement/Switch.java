package ex04controlstatement;

import java.util.Scanner;
/*
switch�� : if�� ó�� ���ǿ� ���� �б��ϴ� ���
	����
		swtch(������ or �����){
			case ��1:
				���๮1; break;
			case ��2:
				���๮2; break;
			default:
				�� ��� ���ǿ� ����ɶ� ����Ǵ� ����
				else�� ���� �ǹ̶� ����ȴ�.
		}
		switch�� ���ο��� break���� �����Ե�� ������
		�����ǰ� ������ ���������Եȴ�.
 */
public class Switch {

	public static void main(String[] args) {
		
		/*
		ScannerŬ����: JDK5.0���� �߰��� Ŭ������ Ű���带
			���� ����ڷκ��� ���� �Է¹����� ����Ѵ�.
			nextLine() : ���ڿ��� �Է¹���
			nextInt() : ������ �Է¹���
		 */
		Scanner scanner =new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���");
		int iNum = scanner.nextInt();
		System.out.println("�Է��� ���ڴ�:"+ iNum);
		
		int remain = iNum % 3;
		
		/*
		���� switch���� break���� ������� ������ �� �Ʒ��� �ִ�
		������� ����ǹǷ� �����ؾ� �Ѵ�.
		��, �Է°��� 9�ΰ�� ������ ���� ��ΰ� ����ǰ� �ȴ�.
		 */
		switch (remain) {
			case 0:
				System.out.println("�������� 0�Դϴ�.");
				break;
			case 1:
				System.out.println("�������� 1�Դϴ�.");
				break;
			default:
				System.out.println("�������� 2�Դϴ�.");
		}
		/*
		switch�� ���� ��������1
		-longŸ���� ������ ����� �Ұ��ϴ�.
		-byte/short/int/char/String���� ��� ������.
		 */
		
		/*long ln =100;
		
		switch(ln) {
		case 100:
			System.out.println("longŸ�� ���??");
		default:
			System.out.println("�ȵǴ±�!");
		}*/
		/*
		switch�� ���� ��������2
		-�񱳽��̳� ������ ���Ұ���.
		 */
		
		/*
		switch(iNum%3==0) {
			System.out.print("���ĵ� �ȵ´±�~");
		}*/
		
		String title = "JAVA";
		switch(title) {
		case "�ڹ�": System.out.println("�ڹ� ����");
			break;
		case "JAVA": System.out.println("JAVA Gooood");
		}
		/*
		���� case�� ���ÿ� ó���Ҷ��� break������ case�� �����Ѵ�.
		if������ ||(��OR)�� ������ �����ѰͰ� �����ϴ�.
		 */
		int season = 4;
		switch(season) {
		case 4: case 5: case 6:
			System.out.println("���Դϴ�.");
			break;
		case 7: case 8: case 9:
			System.out.println("�����Դϴ�.");
			break;
		case 10:
			System.out.println("�����Դϴ�.");
			break;
		case 11: case 12: case 1: case 2:
			System.out.println("�ܿ��Դϴ�.");
			break;
		}

	}

}
