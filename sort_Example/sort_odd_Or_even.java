package sort_Example;

import java.util.Arrays;
import java.util.Random;

public class sort_odd_Or_even {
	/*
	  	�Է�: ���� �迭 int[] a
		���: ¦������ �迭�� �պκп�, Ȧ������ �迭�� �޺κп� ��ġ�ؾ� ��.
		cf) ¦���� ����, Ȧ���� ������ ����.
		
		int[] a = 20���� ������ �� (0~20)
		��� ��� : [0, 16, 18, 6, 0, 18, 4, 16, 6, 2, 16, 1, 7, 15, 5, 5, 1, 19, 13, 19]
		�ð� ���⵵ : O(n)
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

