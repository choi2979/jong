package ex01start;
/*
�ڹ������� ����

1.��Ű�������: Ŭ������ �������� ��� �����ϱ� ���� ��������
	���丮(����)�� �ǹ̷� �����ص� �ȴ�.

2.import�����: ���� ���� Ŭ�������� �ʿ��� �ڹ�Ŭ������ ������
	�������� �������� JDK���� �����ϴ� Ŭ������ ����Ҽ��� �ִ�.

3.Ŭ���������: �ڹ����α׷��� Ŭ���������� �����ǹǷ� �⺻������ 
	�ʿ��� �κ�����  Ŭ������ �׻� �����빮�ڷ� �����ϰ� ������
	Ȯ���ڴ� .java�� �ؾߵȴ�.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaStruct {

	public static void main(String[] args) {
		
		System.out.println("�ڹ��� ������ ����");
		
		Date toDay0fDate = new Date();
		
		System.out.println("���ó���:" + toDay0fDate);
		
		SimpleDateFormat simple =
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String toDayString = simple.format(toDay0fDate);
		System.out.println("�����ȳ���:" + toDayString);
		
	}

}
