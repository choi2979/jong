package ex05method;

public class RecursiveError {
	

	public static void main(String[] args) {
		
		showHi(3);
		

	}
	public static void showHi(int cnt) {
		System.out.println("Hi~!");
		System.out.println("cnt="+ cnt);
		/*.
		�����ڵ�
		1. ���� �����ڷ� ���� cnt�� ���� ����������..
		2. ���ǽ��� ��ġ�� �߸��Ǿ���.
		3. ���ȣ���� �ϱ��� ����üũ�� �Ҽ��ֵ��� �����ؾ��Ѵ�.
		
		StackOverflowError(���� �����÷ο�)
		: ������ �Լ��� ����Ǳ� �������� ��� ������ �����ϴ� �޸𸮷�,
		������ �����̹Ƿ� ���ѷ����� �����ԵǸ� ����ɷ��� �ʰ��Ͽ�
		�ش� ������ �߻��ϰ� �ȴ�.
		
		showHi(--cnt);
		if(cnt==1) {
			return;
		}
		*/
		
		//�Լ� ���� üũ�κ��� ���� �̵���Ų ������ �ڵ�
		if(cnt==1) {
			return;
		}
		showHi(--cnt);
	}

}
