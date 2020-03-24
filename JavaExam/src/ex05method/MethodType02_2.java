package ex05method;

import java.util.Scanner;

public class MethodType02_2 {
	
	static String getHakjum() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수:");
		int kor = scanner.nextInt();
		System.out.println("영어점수:");
		int eng = scanner.nextInt();
		System.out.println("수학점수:");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		String hakjum = "";//☆
		/*
		switch문은 if문과 같이 조건식을 사용할수 없으므로
		평균값을 10으로 나눠서 몫을 통해 점수의 구간을 결정한다.
		99 / 10 => 몫은 9
		90 / 10 => 몫은 9 .. 이와같은 특성을 이용한다.
		 */
		int result = (int)avg / 10;
		switch(result) {
		case 10: case 9:
			hakjum = "A학점"; break;
		case 8:
			hakjum = "B학점"; break;
		case 7:
			hakjum = "C학점"; break;
		case 6:
			hakjum = "D학점"; break;
		default:
			hakjum = "F학점";
		}
		
		return hakjum;
	}

	public static void main(String[] args) {
		
		System.out.println("너의 학점은 "+ getHakjum() +"이얌~!");
		
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s 입니다.", h);
		

	}

}
