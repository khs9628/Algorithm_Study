package mergeSort;

import java.util.Arrays;

public class A_merge {
/*	
		����ð� : O(n)
	
*/	   
		static void merge(int[] a, int start, int middle, int end) {
	        int length = end - start + 1;   // ������ �κ��� ���̸� ���Ѵ�.
	        int[] temp = new int[length];   // ���� ����� ������ �ӽ� �迭�� �����Ѵ�.
	        int i = 0;                      // �ӽ� �迭�� ���� �ε��� ����
	        int index1 = start;             // �պκ�(start ~ middle)�� ���� �ε��� ����
	        int index2 = middle + 1;        // �޺κ�(middle+1 ~ end)�� ���� �ε��� ����

	        while (index1 <= middle && index2 <= end) { // ������ ���� �պκа� �޺κп� �� �� ���� �ִٸ�
	            if (a[index1] < a[index2])              // �պκа� �޺κ��� ������ ���� ���Ͽ�
	                temp[i++] = a[index1++];            // �� ���� ���� �ӽ� �迭�� ���� ����
	            else
	                temp[i++] = a[index2++];
	        }
	        while (index1 <= middle)            // �պκ� �迭�� �����ִ� ���� �ӽ� �迭�� �ִ´�.
	            temp[i++] = a[index1++];
	        while (index2 <= end)               // �ںκ� �迭�� �����ִ� ���� �ӽ� �迭�� �ִ´�.
	            temp[i++] = a[index2++];
	        for (i = 0; i < temp.length; ++i)   // �ӽ� �迭�� ������ a �迭�� start ��ġ�� �����Ѵ�.
	            a[start + i] = temp[i];
	    }

	    public static void main(String[] args) {
	        int[] a1 = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
	        merge(a1, 5, (5 + 9)/ 2, 9);
	        System.out.println(Arrays.toString(a1));

	        int[] a2 = { 10, 11, 12, 13, 14, 17, 18, 19, 15, 16};
	        merge(a2, 5, (5 + 9)/ 2, 9);
	        System.out.println(Arrays.toString(a2));

	        int[] a3 = { 10, 12, 14, 11, 13, 15, 16, 17, 18, 19};
	        merge(a3, 0, (0 + 4)/ 2, 4);
	        System.out.println(Arrays.toString(a3));
	    }
	}


