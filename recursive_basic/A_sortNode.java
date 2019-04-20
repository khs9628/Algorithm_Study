package recursive_basic;

import java.util.Random;
 /*
   	랜덤으로 10개의 수(0~20)를 배열 a에 저장하고 작은 순서대로 출력하는 프로그램을 구현하라.
 	출력결과 :3 5 6 7 9 12 15 17 18 19 
 */

public class A_sortNode {
	static void print(int[] a) {
        for (int i : a)
            System.out.printf("%d ", i);
    }

    static void swap(int[] a, int i, int j) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }

    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; ++i)
            for (int j = i + 1; j < a.length; ++j)
                if (a[i] > a[j])
                    swap(a, i, j);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(20);

        sort(a);
        print(a);

    }
}
