package ex05method;

import java.util.Scanner;

/*
�ó�����] �������� ���ڸ� �Է¹����� �ִ밪�� ���ϴ� 
�޼ҵ带 �����Ͻÿ�. ��, ������ ������ �Ű������� ���޹ް�
������ ������ŭ ScannerŬ������ ���� �Է¹޴´�. 
�Է¹��� ������ �ִ밪�� ã�Ƽ� ��ȯ�ϵ��� �����Ѵ�. 
 */
public class MethodType04_2 {

	public static void main(String[] args) {
		
		int maxValue1 = returnMaxNuber(4);
		System.out.println("�ִ밪1:"+ maxValue1);
		int maxValue2 = returnMaxNuber(6);
		System.out.println("�ִ밪2:"+ maxValue2);

	}
	
	static int returnMaxNuber(int numberCnt) {
		Scanner scanner = new Scanner(System.in);
		
		int maxVal = 0;//�ִ밪�� ������ ����
		for(int i=1 ; i<=numberCnt ; i++) {
			System.out.print("������ �Է��ϼ���:");
			int inputNum = scanner.nextInt();
			
			//�Է¹޴� ������ ù��°�� ���ذ����� �����Ѵ�.
			if(i==1) {
				maxVal = inputNum;
			}
			else {
				//�ι�° �Է°����� maxVal�� ���Ѵ�.
				if(maxVal<inputNum) {
					//���� maxVal���� �Է°��� �� ũ�� �Է°����� ��ü�Ѵ�.
					maxVal = inputNum;
				}
				//maxVal�� ũ�ٸ� �����ϸ� �ǹǷ� else�� �ʿ����.
			}
		}
		return maxVal;
	}

}