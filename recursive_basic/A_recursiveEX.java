package recursive_basic;

public class A_recursiveEX {
	/*
	 i ��ŭ �ݺ��ϴ� ����Լ��� �����Ͻÿ�
	(�־��� ���� x2�� + 1 �� ���� ����ϴ� �Լ��̴�.)
	
	��� ���  : 5
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
