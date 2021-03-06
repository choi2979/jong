package ex06array;

public class TwoArray02_1 {

	public static void main(String[] args) {
		/*
		아래와 같이 2차원배열을 초기화하면 세로크기3, 가로크기4로 지정된다.
		초기화할 요소가 없는 부분은 null로 채워지게 된다.
		※null값 : 아무것도 없는 값을 일컫는다. 즉 빈값을 말한다.
		 */
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		/*
		2차원 배열에서 "배열명.length"로 출력하면 세로크기가 반환된다.
		 */
		System.out.println("배열의 세로크기:"+ arr.length);
		
		/*
		각행의 가로크기는 초기화된 상태에 따라 다를스 있다.
		아래는 0행->2, 2행->4의 크기를 출력한다.
		 */
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("%d행의크기:%d\n", i, arr[i].length);
		}
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1]="+ arr[0][1]);
		/*
		ArrayIndexOutOfBoundsException 예외발생됨.
		즉, 배열의 index를 초과했다는 뜻.
		System.out.println("arr[0][3]="+ arr[0][3]);
		*/
	}

}