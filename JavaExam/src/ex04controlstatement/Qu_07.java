package ex04controlstatement;
/*
����1] ������ ���� ����� ����ϴ� ���α׷��� while������ �ۼ��Ͻÿ�.
���ϸ� : Qu_07.java
���]
	*
	* *
	* * *
	* * * *
	* * * * *
*/

public class Qu_07 {

	public static void main(String[] args) {
		int m = 1;//'��'�� �ش��ϴ� ����
		while(m <= 5) {
			int n = 1;//'*' ��¿� �ش��ϴ� ����
			while(n <= 5) {
				//n�� m�� ������ŭ*�� ����Ѵ�.
				if(n <= m) {
					System.out.print("* ");
				}
				/* �ʿ����
				 	else {
					System.out.print("  ");
				}*/
			n++;
			}
		System.out.println();//n�� �ݺ��� ������ �ٹٲ�
		m++;
		}
		/*
		��������] �� ������ for������ �����Ͻÿ�.
		 */

	}

}
