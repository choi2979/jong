package ex05method;

import java.util.Scanner;

/*
����5-1) ���ϸ� : QuSimpleOperation.java (���̵�:��)
�ΰ��� ������ �Է¹޾Ƽ� ��Ģ������ ����� ����ϴ� �޼ҵ�� main�޼ҵ带 �ۼ��غ���. �� �������� ��� �������� ���� ����ؾ� �Ѵ�.
�Ķ��Ÿ�� ���޵Ǵ� �� ���ڴ� ��� 0 �̻��� ���� �����̴�.
�޼ҵ�� : arithmetic()
���࿹ :
---------- java ----------
������� -> 177
������� -> 23
������� -> 7700
������ �� -> 1
������ ������ -> 23
--------------------------
 */

public class QuSimpleOperation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1:");
		int num1 = scan.nextInt();
		System.out.print("����2:");
		int num2 = scan.nextInt();
		arithmetic(num1, num2);

	}
	
	static void arithmetic(int numo, int numt) {
		
		int p= numo+numt;
		int m= numo-numt;
		int g= numo*numt;
		int n= numo/numt;
		int z= numo%numt;
		
        System.out.println("�������->"+ p); //(a+b)
        System.out.println("�������->"+ m); //(a-b)
        System.out.println("�������->"+ g);
        System.out.println("������ ��->"+ n);
        System.out.println("������ ������->"+ z); //printf( % = %%
	}
		
		
	

}
