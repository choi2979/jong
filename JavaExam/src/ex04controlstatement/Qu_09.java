package ex04controlstatement;
/*
����3] ������ ���� ����� ����ϴ� ���α׷��� for������ �ۼ��Ͻÿ�.
���ϸ� : Qu_09.java
���]	
* * * * *
* * * *
* * *
* *
*
 */
public class Qu_09 {

	public static void main(String[] args) {
		
		//final int FLOOR = 5; ���� ��Ÿ���� ����
		
		/*
		�ش� ����� ����ϱ� ���� �Ϲݽ�
			y = �� - x + 1
			��, ���� �����Ҷ� y�� �����ϰ� �ȴ�.
		 */
		
		for(int n = 1 ; n<=5 ; n++) {//5>>FLOOR
			for(int m =1 ; m<=5 ; m++) {//m<=5 => m<=(FLOOR-n+1)
				if(n+m<=6) {
					System.out.print("* ");
				}
				/*else {
					System.out.print("  ");
				}�ʿ�x*/
			}
			System.out.println();
		}
		
	}

	

	
		
}


