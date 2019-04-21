package sort_Example;

import java.util.Arrays;

public class sort_quick_String {
    
	static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(String[] a, int start, int end) {
 
    }

    static void quickSort(String[] a, int start, int end) {
  
    }

    public static void main(String[] args) {
        String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };

        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

}
