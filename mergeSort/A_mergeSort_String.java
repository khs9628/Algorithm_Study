package mergeSort;

import java.util.Arrays;

public class A_mergeSort_String {
	
	/*
	mergeSort를 이용하여 String 배열을 정렬하시오.
	
	String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
	실행 결과 : [five, four, one, seven, six, three, two, zero]

	 */	
	static void mergeSort(String[] a, int start, int end) {
        if (start == end) return;
        int middle = (start + end) / 2;
        mergeSort(a, start, middle);
        mergeSort(a, middle + 1, end);
        merge(a, start, middle, end);
    }

    static void merge(String[] a, int start, int middle, int end) {
        int length = end - start + 1;
        String[] temp = new String[length];
        int i = 0;
        int index1 = start;
        int index2 = middle + 1;

        while (index1 <= middle && index2 <= end) {
            if (a[index1].compareTo(a[index2]) < 0)
                temp[i++] = a[index1++];
            else
                temp[i++] = a[index2++];
        }
        while (index1 <= middle)
            temp[i++] = a[index1++];
        while (index2 <= end)
            temp[i++] = a[index2++];
        for (i = 0; i < temp.length; ++i)
            a[start + i] = temp[i];
    }


    public static void main(String[] args) {
        String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };

        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
	
}
