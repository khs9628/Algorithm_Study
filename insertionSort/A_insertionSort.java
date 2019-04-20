package insertionSort;

import java.util.Arrays;

public class A_insertionSort {
	/*
	      삽입정렬 기본 개념
	   void insertionSort(int[] a) {
	    for (int i = 1; i < a.length; ++i) {
	        int value = a[i];
	        a 배열의 0 에서 i-1 사이에서 value 보다 큰 값들을
	            뒤로 한 칸씩 이동하고, 그 값들 앞에 value를 넣는다.
	    }
	}
	출력 결과 : [11, 13, 14, 15, 17, 19]

	 */
	static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int value = a[i];             // 삽입할 값 보관
            int j;
            for (j = i - 1; j >= 0; --j)  // 뒤로 이동
                if (a[j] > value)
                    a[j + 1] = a[j];
                else
                    break;
            a[j + 1] = value;             // 값 삽입
        }
    }

    public static void main(String[] args) {
        int[] a = { 17, 14, 11, 19, 13, 15 };

        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
