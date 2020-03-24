package ex05method;
/*
����5-4) ���ϸ� : QuFindPrimeNumber.java  (���̵�:��)
���޵� ���� �Ҽ����� �ƴ����� �Ǵ��Ͽ� �Ҽ��� ��� true�� �ƴϸ� false�� ��ȯ�ϴ� �޼ҵ带 �����ϰ�, �̸� �̿��ؼ� 1���� 100������ �Ҽ��� ���� ����ϴ� main�޼ҵ带 ��������.
�޼ҵ�� : isPrimeNumber()
�Ҽ��� : Ư�� ������ ������ �ִ°��� 1�� �ڱ��ڽŹۿ� ���� ��
 */

public class QuFindPrimeNumber {
	
	static boolean isPrimeNumber(int num){
		
		if(num==1) {
			//1�� �Ҽ��� �ƴϹǷ� ������ false ��ȯ
			return false;
		}
		else {
			/*
			��� �ڿ����� 1�� �ڽ����� �������Ƿ� �� ������ ������
			������ ���� ������ ������������ �Ǵ��Ѵ�.
			 */
			for(int i=2 ; i<num ; i++) {
				/*
				1�� �ڽ��� ������ ���ڷ� ������ �������� �Ҽ��� 
				�ƴϹǷ� �� ���Ĵ� �˻��� �ʿ䰡 ����.
				�ǴܵǴ� ��� false�� ��ȯ�Ѵ�.
				 */
				if(num%i==0)
					return false;
			}
			//�� �ݺ����� ���������� ������ �������� ���ڰ� �����Ƿ� �Ҽ��� �Ǵ�.
			return true;
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println("1~100������ �Ҽ� ���:");
		for(int su=1 ; su<=100 ; su++ ) {
			if(isPrimeNumber(su)==true) {
				System.out.println("�Ҽ�:"+ su);
			}
		}

	}

}
