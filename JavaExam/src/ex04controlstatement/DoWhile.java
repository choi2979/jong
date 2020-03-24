package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
do ~ while��
	: �ݵ�� �ѹ��� �����ؾ� �� ��� ������� �ݺ���.
	�� ������ �˻���� ������ �ѹ��� ����ȴ�.
	����
		�ݺ��� ���� �ʱⰪ;
		do {
			���ǿ� ������ ���� ���๮��;
			������;
		}while(���ǽ�); <- �ݵ��;(�����ݷ�)���� �������Ѵ�.                                                                   
 */
public class DoWhile {

	public static void main(String[] args) throws IOException {
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			
			i++;
		}while(i<=10);
		System.out.println("1~10������ ������:"+ sum);
		
		int total = 0;
		int j = 1;
		
		do {
			if(j%4==0 || j%7==0) {
				total += j; 
			}
		j++;
		}while(j<=1000);
		System.out.println("1~1000������ 4or7�� ����� ��:"+ total);
		
		/*
		�ó�����]����, ����, ���� ������ ����ڷκ��� �Է¹��� ��
		����� ���� A~F������ �Ǵ��Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		��, ����ڰ� X(��ҹ��� ���о���)�� �Է��ϸ� ���α׷��� 
		����Ǿ�� �ϸ� do~while������ �����ؾ� �Ѵ�. 
		 */
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		do {
			System.out.print("��������:");
			kor = scanner.nextInt();
			System.out.print("��������:");
			eng = scanner.nextInt();
			System.out.print("��������:");
			math = scanner.nextInt();
			
			avg = (kor+eng+math) / (3*10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A����"); break;
			case 8:
				System.out.println("B����"); break;
			case 7:
				System.out.println("C����"); break;
			case 6:
				System.out.println("D����"); break;
			default:
				System.out.println("F����"); break;
			}
			
			
			System.out.println("�����Ϸ��� x(X)�� �Է��ϼ���.");
			System.out.println("����Ϸ��� �ƹ�Ű�� �Է��ϼ���.");
			exitCode = System.in.read();
			
		}while( !(exitCode=='x' || exitCode=='X'));

	}

}
