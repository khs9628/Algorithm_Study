package heapSort;

import java.util.Arrays;

public class A_heapSort_reverse {
	/*
	 heapSort_최대힙 
	 
	heapify 함수 수행 시간 : O(logN)
	buildHeap 함수 수행 시간 : O(N logN)
	heapSort 함수 수행 시간 : O(N logN)
	
	int[] a = { 3, 8, 2, 10, 4, 6, 7, 1, 9, 5 };
	실행 결과 : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

	*/
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void buildHeap(int[] a) {
        int end = a.length - 1;
        for (int i = end / 2; i >= 0; --i)
            heapify(a, i, end);
    }

    static void heapify(int[] a, int k, int end) {
        int left = 2 * k + 1, right = 2 * k + 2;
        int larger;
        if (right <= end)
            larger = (a[left] > a[right]) ? left : right;
        else if (left <= end) larger = left;
        else return;
        if (a[larger] > a[k]) {
            swap(a, larger, k);
            heapify(a, larger, end);
        }
    }

    static void heapSort(int[] a) {
        buildHeap(a);
        for (int end = a.length - 1; end >= 1; --end) {
            swap(a, 0, end);
            heapify(a, 0, end - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = { 3, 8, 2, 10, 4, 6, 7, 1, 9, 5 };
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }

}	
