package ex06array;

import java.util.Random;

public class Array01_2 {

	public static void main(String[] args) {
		
		//�����������1
		double rndNumber = Math.random();
		System.out.println("�����ȳ���[�Ǽ�]:"+ rndNumber);
		int intNumber = (int)(Math.random()*100);
		System.out.println("�����ȳ���[����]:"+ intNumber);
		
		//�����������2
		Random random =new Random();
		System.out.println("�����ȳ���:"+ random.nextInt());
		System.out.println("===========================");
		/*
		�ζǹ�ȣó�� 1~45������ ������ �����ϴ� ���
		1. 0.xxxx ������ ������ ������ �����ϱ� ����
			100(Ȥ�� �� ū���� �������)�� ������ int������ ����ȯ�Ѵ�.
		2. 45�� %������ �Ͽ� �������� ���Ѵ�. �̶� ����� 0~44���ȴ�.
		3. 2���� ����� +1�Ѵ�. ��������� 1~45������ ������
			�����Ҽ� �ְԵȴ�.
		*/
		System.out.println("1~45������ ��������:"+ ((int)((Math.random()*100)%45)+1));
		
		System.out.println("=======================================");
		
		System.out.println("ũ�Ⱑ 6�� �迭�� ���� �Է�");
		int[] lottoNum = new int[6];
		
		for(int i=0 ; i<lottoNum.length ; i++) {
			lottoNum[i] = (int)((Math.random()*100)%45)+1;
			System.out.printf("%d ", lottoNum[i]);
		
		}
		

	}

}
