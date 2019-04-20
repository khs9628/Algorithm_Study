package selectionSort;

import java.util.Arrays;

public class A_selectionSort {
	/*
	  for (int i = 0; i <= a.length-2; ++i) {
	    �迭 a�� i���� ������ �ּҰ��� ã�´�.
	    �ּҰ��� i��ġ�� ���� ���� �ٲ۴�.
	}*/
	
    // �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
    static void swap(int[] a, int i, int j) {

    }

    // �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
    static int findMin(int[] a, int start) {
    	 for (int i = 0; i < a.length; ++i) {
             int minIndex = findMin(a, i);
             System.out.println(a[minIndex]);
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