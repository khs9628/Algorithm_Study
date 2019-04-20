package recursive_basic;

public class A_recursiveEX {
	/*
	 i 만큼 반복하는 재귀함수를 구현하시오
	(주어진 수의 x2에 + 1 한 값을 출력하는 함수이다.)
	
	출력 결과  : 5
			11
			23
			47
			95

	*/
	public static int recursive(int n) {
		int i;
		if(n<1) {
			return 2;
		}
		else {
			i = (2 * recursive(n-1)) +1;
			System.out.println(i);
			return i;
		}
	}
		
	public static void main(String [] args) {
			int i = 5;
			recursive(i);
		}	
}
