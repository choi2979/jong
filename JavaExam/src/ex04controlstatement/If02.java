package ex04controlstatement;

public class If02 {
	/*
	if��(���ǹ�, �нù�)
	����2
		if(���ǹ�){
			���ǹ��� ���϶� ���๮��;
		}
		else{
			���ǹ��� �����϶� ���๮��;
		}
	 */
	public static void main(String[] args) {
		
		int num = 99;
		
		if(num%2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		/*
		���׿�����(���ǿ�����)
			if~else���� ���������� ª���� �ڵ�� ǥ���� �����ϹǷ�
			�ǹ����� ���� ���Ǵ� ������
			����
				���� = (���ǽ�) ? ���϶��� : �����϶���;
		 */
		
		String numberResult = (num%2==0) ? "¦����":"Ȧ����";
		System.out.println("���� "+num+"�� "+numberResult);
		/*
		�ó�����] ������ ¦/Ȧ������ ���� �Ǵ��� �� 100
		�̻������� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		int num2 = 120;
		if(num2%2 == 0) {
			//¦���϶�...
			if(num2>=100) {
				System.out.println("¦���̸鼭 100�̻�");
			}
			else {
				System.out.println("¦���̸鼭 100�̸�");
			}
		}
		else {
			//Ȧ���϶�...
			if(num2>=100) {
				System.out.println("Ȧ���̸鼭 100�̻�");
			}
			else {
				System.out.println("Ȧ���̸鼭 100�̸�");
			}
		}
	}

}
