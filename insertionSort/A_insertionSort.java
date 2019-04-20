package insertionSort;

import java.util.Arrays;

public class A_insertionSort {
	/*
	      �������� �⺻ ����
	   void insertionSort(int[] a) {
	    for (int i = 1; i < a.length; ++i) {
	        int value = a[i];
	        a �迭�� 0 ���� i-1 ���̿��� value ���� ū ������
	            �ڷ� �� ĭ�� �̵��ϰ�, �� ���� �տ� value�� �ִ´�.
	    }
	}
	��� ��� : [11, 13, 14, 15, 17, 19]

	 */
	static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int value = a[i];             // ������ �� ����
            int j;
            for (j = i - 1; j >= 0; --j)  // �ڷ� �̵�
                if (a[j] > value)
                    a[j + 1] = a[j];
                else
                    break;
            a[j + 1] = value;             // �� ����
        }
    }

    public static void main(String[] args) {
        int[] a = { 17, 14, 11, 19, 13, 15 };

        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
