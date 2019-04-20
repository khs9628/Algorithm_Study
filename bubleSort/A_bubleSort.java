package bubleSort;

import java.util.Arrays;

public class A_bubleSort {
	/*
	 �������� �⺻ ����
	 for (i = a.length - 1; i >= 1; --i) {
    	boolean �Ϸ� = true;
    	for (j = 0; j < i; ++j) {
        	if (a[j] > a[j + 1]) {
            	swap(a, j, j + 1);
            	�Ϸ� = false;
        	}
    	}
    	if (�Ϸ�) break;
	}
	
	��� ��� : [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
	
	*/

	    // �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
	    static void swap(int[] a, int i, int j) {
	        int temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }

	    // bubble sort
	    static void bubbleSort(int[] a) {
	        for (int i = a.length - 1; i >= 1; --i) {
	            for (int j = 0; j < i; ++j) {
	                if (a[j] > a[j + 1])
	                    swap(a, j, j + 1);
	            }
	        }
	    }
	    
	    // bubble sort2 
	    static void bubbleSort_improve(int[] a) {
	        for (int i = a.length - 1; i >= 1; --i) {
	            boolean �Ϸ� = true;
	            for (int j = 0; j < i; ++j) {
	                if (a[j] > a[j + 1]) {
	                    swap(a, j, j + 1);
	                    �Ϸ� = false;
	                }
	            }
	            if (�Ϸ�) break;
	        }
	    }

	    
	    public static void main(String[] args) {
	        int[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };

	        bubbleSort(a);
	        System.out.println(Arrays.toString(a));
	    }

	}

