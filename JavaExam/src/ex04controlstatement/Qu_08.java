package ex04controlstatement;
/*
����2] 1~100������ ������ 3�ǹ�� �̰ų� 7�ǹ���� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	��, 3�� 7�� ������� ��� �տ��� �����ؾ� �Ѵ�. 
	����ǰ���� �����Ǵ� ��� ���� �ֿܼ� print�Ѵ�.
���ϸ� : Qu_08.java
 */

public class Qu_08 {

	public static void main(String[] args) {
		
		int total = 0;
		int n = 1;
		while(n<=100) {
	
			if(n%3==0 || n%7==0) {
				if(n%21 !=0) {
					total += n;
					System.out.print("n="+ n+" ");
		/*for (int i=1 ; i<=100 ; i++) { �ݺ�Ƚ���� ������ �ֱ� ������ for�� ���
		
			if(i%3==0 || i%7==0) {
				3�� 7�� �������� ����...
				if(i%(3*7)!=0) {
					sum += i;
					System.out.println("i="+ i);
				}
			}
		}
		System.out.println("���:"+ sum);
		*/
				}
			}
			
			
			n++;		
		}
		System.out.println("="+ total);
		

	}

}
