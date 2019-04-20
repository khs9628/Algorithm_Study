package sort_Example;

import java.util.Arrays;

public class sort_odd_Or_even_partition {
	/*
	quick sort 구현의 partition 메소드 응용
	int[] a = [0, 2, 4, 6, 1, 5, 3, 7]
	출력 결과 : int[] a = {0, 1, 2, 3, 4, 5, 6, 7}
	시간 복잡도 : O(n)
	 */
	
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    
    // 2로 나누어진다면 (짝수라면) index - 1 의 위치로 swap시키고 그렇지 않다면 (홀수라면) continue
    static void partition(int[] a) {
        int j = -1;
        for (int i = 0; i < a.length - 1; ++i)
            if (a[i] % 2 == 0)
                swap(a, ++j, i);
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7};
        partition(a);
        System.out.println(Arrays.toString(a));
    }

}
