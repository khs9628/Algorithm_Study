package sort_Example;

import java.util.Arrays;
import java.util.Random;

public class sort_odd_Or_even {
	/*
	  	입력: 정수 배열 int[] a
		출력: 짝수들이 배열의 앞부분에, 홀수들은 배열의 뒷부분에 위치해야 함.
		cf) 짝수들 순서, 홀수는 순서는 무관.
		
		int[] a = 20개의 랜덤의 수 (0~20)
		출력 결과 : [0, 16, 18, 6, 0, 18, 4, 16, 6, 2, 16, 1, 7, 15, 5, 5, 1, 19, 13, 19]
		시간 복잡도 : O(n)
	 */
    static void swap(int[] a, int i, int j) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }

    static void moveEvenNumbersToFron(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (true) {
            while (a[start] % 2 == 0 && start < end)
                ++start;
            while (a[end] % 2 == 1 && start < end)
                --end;
            if (start >= end) break;
            swap(a, start, end);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(20);

        moveEvenNumbersToFron(a);
        System.out.println(Arrays.toString(a));
    }

   	}

