package quickSort;

import java.util.Arrays;

public class A_quickSort_String {
	/*
	
	quickSort를 이용하여 String 배열을 정렬하시오.
	
	String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
	실행 결과 : [five, four, one, seven, six, three, two, zero]

	 */	
	
    static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(String[] a, int start, int end) {
        String value = a[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; ++j)
            if (a[j].compareTo(value) < 0)
                swap(a, ++i, j);
        swap(a, i + 1, end);
        return i + 1;
    }

    static void quickSort(String[] a, int start, int end) {
        if (start >= end) return;
        int middle = partition(a, start, end);
        quickSort(a, start, middle-1);
        quickSort(a, middle+1, end);
    }


    public static void main(String[] args) {
        String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };

        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

}
