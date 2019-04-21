package quickSort;

import java.util.Arrays;
import java.util.Random;

public class A_partition {
	/*
	
	Q) ������ ���� ��������, 
	       ���ذ����� ���� ������ �迭�� �պκ����� �̵��ϰ�,
	       ���ذ����� ū ������ �迭�� �޺κ����� �̵��ϴ� �˰����� ��������.
	
	partition(A[ ], p, r)
	{
	    x �� A[r];                        �� ���ؿ��� (pivot)
	    i �� p-1;                         �� i�� 1������ ������
	    for j �� p to r-1                 �� j�� 3������ ���� ����
	      if (A[j] �� x) then A[++i] �� A[j];               
	                                      �� i �� ���� �� A[i] �� A[j] ��ȯ
	    A[i+1] �� A[r];                   �� ���� ���ҿ� 2���� ù���� ��ȯ
	    return i+1;                       �� ���� ������ ��ġ ����
	}
	
	ex) ��� ���  7(a[end]) ���� ���� ������ ���� -> 7�̻��� ������ �̸��� �������� ���ĵȴ�.
	[4, 14, 15, 5, 0, 5, 13, 9, 18, 7]
	[4, 5, 0, 5] [7, 14, 13, 9, 18, 15]
	���� �ð� : O(n) 
	
	cf)���ذ���, �迭�� �ּҰ��� ��쿡 partition ����� ��� �Ǵ°�?
	       ���ذ���, �迭�� �ִ밪�� ��쿡 partition ����� ��� �Ǵ°�?   -> �־��� ����� ������ �ȴ�.

	 */
	
	static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int[] a, int start, int end) {
        int value = a[end];                    // ���ذ�
        int i = start - 1;                     // i�� 1������ ������
        for (int j = start; j <= end - 1; ++j) // j�� 3������ ���� ����
            if (a[j] < value)          // a[j] ���� 1������ ���ϸ�
                swap(a, ++i, j);       // a[j] ���� 1������ ���� �߰��Ѵ�. 1���� ũ�� 1����.
        swap(a, i + 1, end);           // ���ذ��� a[end] ���ҿ� 2������ ���� ���Ҹ� ��ȯ�Ѵ�.
        return i + 1;                  // ���ذ� ��ġ ����
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(20);

        System.out.println(Arrays.toString(a));
        int middle = partition(a, 0, a.length - 1);
        System.out.print(Arrays.toString(Arrays.copyOfRange(a, 0, middle)) + " ");
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, middle, a.length)));
    }

}
