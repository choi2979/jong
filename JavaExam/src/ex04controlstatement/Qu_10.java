package ex04controlstatement;
/*
����4] �������� ���� for���� �̿��ؼ� ������ ���� ����Ͻÿ�
���ϸ� : Qu_10.java
���]				
	2*1=2 3*1=3 ~~~~~~~~~~  9*1=9
	2*2=4   ~~~~~~~~~~~~~~~ 9*2=18
	~~~~~~~~~~~~~
	2*8=16~~~~~~~~~~~~~~~~9*8=72
	2*9=18~~~~~~~~~~~~~~~~9*9=81
 */
public class Qu_10 {

	public static void main(String[] args) {
		//su�� ������ ���¿��� dan�� �þ�� ���·� for�� ����
		for(int su = 1 ; su<=9 ; su++) {
			for(int dan =2 ; dan<=9 ; dan++) {
				System.out.print(dan +"*"+ su +"="+(dan*su)+" ");
				
			}
			//���� ��� �� �ٹٲ� ó��
			System.out.println();
		}
	}

}
