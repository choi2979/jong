package ex05method;

import java.io.IOException;
import java.util.Scanner;

/*
�ó�����] ����ڷκ��� �ΰ��� ������ ��������ڸ� �Է¹޾Ƽ�
�������� ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
�׸��� ����ڰ� �Է��� �����ڸ� ���Ϲ޾� ����Ͻÿ�.
�Է¿�)
	����1�� �Է��ϼ��� : 100
	����2�� �Է��ϼ��� : 200
	��������ڸ� �Է��ϼ���.(+,-,*,/,%) : +
	������ : 100 + 200 = 300
�����Է��� ScannerŬ������ ��������� �Է��� read()�޼ҵ� ����Ұ�.
 */
public class MethodType02_3 {

	public static void main(String[] args) throws IOException{
		
		String r = numArith();
		System.out.println("������:"+ r);
	}
	
	static String numArith() throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����1:");
		int num1 = scan.nextInt();
		System.out.println("����2:");
		int num2 = scan.nextInt();
		System.out.println("��������ڸ� �Է��ϼ���:");
		char oper = (char)System.in.read();
		
		String result;
		
		switch(oper) {
		case '+':
			result = num1 +"+"+ num2 +"="+ (num1+num2);
			break;
		case '-':
			result = num1 +"-"+ num2 +"="+ (num1-num2);
			break;
		case '*':
			result = num1 +"*"+ num2 +"="+ (num1*num2);
			break;
		case '/':
			result = num1 +"/"+ num2 +"="+ (num1/num2);
			break;
		case '%':
			result = num1 +"%"+ num2 +"="+ (num1%num2);
			break;
		default:
			result ="�����ڰ� �߸��Ǿ����ϴ�";
		}
		
		return result;
	}

}
