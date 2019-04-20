package sort_Example;

import java.util.Arrays;

public class sort_binaryChar {
	/*
	  	�Է�: ���� �迭 char[] a
		���: ������������ �迭 �����ϱ�.
		cf) �迭���� '0', '1' ���ڸ� ����ִ�
		char[] a = "010101110101"
		��� ��� : [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1]
		�ð� ���⵵ : O(n)
	 */
	
    static void sort(char[] a) {
	        int count = 0;
	        for (char c : a)
	            if (c == '0') ++count;
	        Arrays.fill(a, 0, count, '0');
	        Arrays.fill(a, count, a.length, '1');
	        
/*
	    Arrays.fill(�迭, �����ε���, ���ε���, ��)
	        �迭����, �����ε��� <= index < ���ε��� ��ġ�� ���� ä���.
*/
	        
	    }

	    public static void main(String[] args) {
	        char[] a = "010101110101".toCharArray();
	        sort(a);
	        System.out.println(Arrays.toString(a));
	    }
}
