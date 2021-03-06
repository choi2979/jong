package ex03operator;

public class LogicOperator {

	public static void main(String[] args) {
		/*
		논리연산자
			&& : 논리And. 양쪽모두가 true일때만 true,
				나머지는 false를 반환한다.
			|| : 논리Or. 한쪽만 true이면 true를 반환하고,
				양쪽 모두 false일때만 false를 반환한다.
			! :논리 Not. 반대의 논리값을 반환한다.
		 */
		int num1 = 10, num2=20;
		
		boolean result1 = (num1==100 && num2==20);//f && t => false
		boolean result2 = (num1<12 || num2>=30);//t || f => true
		
		System.out.println("result1의 결과:"+ result1);//false반환
		System.out.println("result2의 결과:"+ result2);//true반환
		//num1과 num2가 다를때 if 구문이 실행된다.
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
	}

}
