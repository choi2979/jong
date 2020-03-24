package ex02variable;

public class EscapeSequence {
	
	/*
	Escape Sequence(�̽������� ������) : Ư�� ���Ŀ� �°� ����ϱ�
		���� ����ϴ� ���ڷ� \(��������)�� ������ �ȴ�.
	 */

	public static void main(String[] args) {
		
		/*
		\t : ��(tab) ���. �����̽� 4ĭ�� �����.
		 */
		System.out.println("4���� ����~~!");
		System.out.println("4����\t����~~!");
		/*
		\n : �ٹٲ�(Line feed) ���
		 */
		System.out.print("KOSMO�� ���Ű� ȯ���մϴ�.\n");
		System.out.print("������\n�غ��ô�.\n");
		
		/*
		\" : �ֵ���ǥ�� ǥ���ϰ� ���� �� ���
		 */
		//System.out.println("���� "������"�� �ǰ�;��");
		System.out.println("���� \"������\"�� �ǰ�;��");
		 
		/*
		printf()�� : ���ڿ��� ���Ŀ� ���缭 ����ؾ��Ҷ� ����Ѵ�.
		���Ĺ���
		 	%d : ������ ���
		 	%f : �Ǽ��� ���
		 	%s : ���ڿ� ���
		 	%c : ���� ���
		 	%n : �ٹٲ� ������� \n�� ������
		*/
		int kor=81, eng=97, math=79;
		System.out.printf("����:%d, ����:%d, ����:%d%n", kor, eng, math);
		System.out.println("\n����:"+kor+", ����:"+eng+", ����:"+math);
		
		double avg = (kor+eng+math) / 3.0;
		System.out.printf("�������:%f%n", avg);
		
		/*
		printf()���� ���� ���Ĺ��ڿ� ��½� �ڸ��� �����ϱ�
		Ex) %4d : ������ ����Ҷ� ��ü�ڸ����� 4�ڸ��� ǥ��
			%6/2f : �Ǽ��� ����Ҷ� ��ü�ڸ����� 6�ڸ�, �Ҽ����� 2�ڸ� ǥ��
			����϶��� ��������, �����϶��� �������� �Ǿ� ���
		 */
		System.out.printf("����:%d, ����:%d, ����%d, "+ "���:%f %n", kor, eng, math, avg);
		System.out.printf("����:%6d, ����:%6d, ����%6d, "+ "���:%7.2f %n", kor, eng, math, avg);
		System.out.printf("����:%-6d, ����:%-6d, ����%-6d, "+ "���:%-7.2f %n", kor, eng, math, avg);
		
		
		
	}
}
