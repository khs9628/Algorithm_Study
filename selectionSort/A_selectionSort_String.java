package selectionSort;

import java.util.Arrays;

public class A_selectionSort_String {
	
	/*
	String���� ������ �迭 a�� �������ķ� �����Ͻÿ�.
	�迭 a�� i���� ������ �ּҰ��� ã�´�.
	�ּҰ��� i��ġ�� ���� ���� �ٲ۴�.
	
	cf)
	int ��          if (a > b)
    String ��ü ��  if (a.compareTo(b) > 0)

	
	String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };	
	��� ��� : [five, four, one, seven, six, three, two, zero]
	 
	 */
	
	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
    static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
    static int findMin(String[] a, int start) {
        String minValue = a[start];
        int minIndex = start;
        for (int i = start + 1; i < a.length; ++i) {
            if (a[i].compareTo(minValue) < 0) {
                minValue = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // selection sort
    static void selectionSort(String[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ�
            swap(a, i, minIndex);         // �� ���� i ��ġ�� �̵��Ѵ�
        }
    }

    public static void main(String[] args) {
        String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };

        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}

