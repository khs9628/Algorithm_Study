package sort_Example;

import java.util.Arrays;

public class sort_binaryChar {
	/*
	  	입력: 문자 배열 char[] a
		출력: 오름차순으로 배열 정렬하기.
		cf) 배열에는 '0', '1' 문자만 들어있다
		char[] a = "010101110101"
		출력 결과 : [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1]
		시간 복잡도 : O(n)
	 */
	
    static void sort(char[] a) {
	        int count = 0;
	        for (char c : a)
	            if (c == '0') ++count;
	        Arrays.fill(a, 0, count, '0');
	        Arrays.fill(a, count, a.length, '1');
	        
/*
	    Arrays.fill(배열, 시작인덱스, 끝인덱스, 값)
	        배열에서, 시작인덱스 <= index < 끝인덱스 위치에 값을 채운다.
*/
	        
	    }

	    public static void main(String[] args) {
	        char[] a = "010101110101".toCharArray();
	        sort(a);
	        System.out.println(Arrays.toString(a));
	    }
}
