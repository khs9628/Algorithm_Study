package sort_Example;

import java.util.Arrays;

public class sort_smallChar {
	/*
	  	입력: 문자 배열 char[]
		출력: 오름차순으로 배열 정렬하기.
		cf) 배열에는 소문자만 들어있다.
		char[] a = "helloworld"
		출력 결과 : [d, e, h, l, l, l, o, o, r, w]
		시간 복잡도 : O(n)
*/
    static void sort(char[] a) {
        int[] count = new int[26];
        for (int i = 0; i < a.length; ++i)
            count[a[i] - 'a']++;
        int index = 0;
        for (int i = 0; i < count.length; ++i) {
            char c = (char)('a' + i);
            for (int j = 0; j < count[i]; ++j)
                a[index++] = c;
        }
    }

    public static void main(String[] args) {
        char[] a = "helloworld".toCharArray();
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}

