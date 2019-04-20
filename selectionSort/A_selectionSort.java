package selectionSort;

import java.util.Arrays;

public class A_selectionSort {
	/*
	    ���� ���� �⺻ ����
	  for (int i = 0; i <= a.length-2; ++i) {
	    �迭 a�� i���� ������ �ּҰ��� ã�´�.
	    �ּҰ��� i��ġ�� ���� ���� �ٲ۴�.
	}
	
	int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };
	��� ��� : [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
	*/
	
    // �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
    static void swap(int[] a, int i, int j) {
    	int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
    static int findMin(int[] a, int start) {
    	int minValue = a[start];
        int minIndex = start;
        for (int i = start + 1; i < a.length; ++i) {
            if (a[i] < minValue) {
                minValue = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // selection sort
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ�
            swap(a, i, minIndex);         // �� ���� i ��ġ�� �̵��Ѵ�
        }
    }

    public static void main(String[] args) {
        int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };

        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
