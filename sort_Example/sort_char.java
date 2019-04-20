package sort_Example;

import java.util.Arrays;

public class sort_char {
	/*
		입력: 문자 배열 char[] a
		출력: 오름차순으로 배열 정렬하기.
		Java 표준 라이브러리의 Arrays.sort 메소드를 이용하여 구현
		시간 복잡도 : O(n2)
		char[] a = "hello world!"
		출력 결과 : [ , !, d, e, h, l, l, l, o, o, r, w]
	 */
    static void sort(char[] a) {
        Arrays.sort(a); // O(N logN)
    }

    public static void main(String[] args) {
        char[] a = "hello world!".toCharArray();
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}

