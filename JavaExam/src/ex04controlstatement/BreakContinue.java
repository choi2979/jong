package ex04controlstatement;
/*
break�� : 
	�ݺ����̳� switch������ �ַ� ���Ǹ� ��������
	 break�� �����ԵǸ� �ش� ���� Ż���Ѵ�.
	 ���� ��ø�� �ݺ����� ���̶�� ���� ����� �� �ϳ���
	 Ż���ϰԵȴ�.
continue�� :
	�ݺ������� continue�� ������ ���� ó������ ���ư���
	������ Ȯ���ϴ�. ���� continue �Ʒ� ������ �������
	�ʴ´�.
 */

public class BreakContinue {

	public static void main(String[] args) {
		
		int i = 0;
		while(true) {
			i++;
			System.out.printf("[i�� %d�϶�]\n", i);
			/*
			���峻���� break, continue�� ����Ҷ��� �ݵ�� �Ʒ���
			���� if���� ����ؾ��Ѵ�. ���Ǻη� ����ǰų� �׷��� �ʰ�
			ó���ؾ� �����Ϸ��� ������ �߻���Ű�� �ʴ´�.
			 */
			System.out.println("continue���� ��¹�");
			if(i%2==0) continue;
			System.out.println("continue���� ��¹�");
			
			System.out.println("break���� ��¹�");
			if(i==3) break;
			System.out.println("break���� ��¹�");
		}
		/*
		��ø�� �ݺ��� �ȿ��� break�� ������ '���� ����� �ݺ��� �ϳ��� Ż��'
		�ϰ� �ȴ�.
		 */
		for(int x =1 ; x<=5 ; x++) {
			System.out.println("x="+ x);
			
			for(int y =1 ; y<=5 ; y++) {
				System.out.println("y="+ y);
				if(y==3)
					break;//y�� �ݺ��Ǵ� for���� Ż���Ѵ�.
			}
		}

	}

}
