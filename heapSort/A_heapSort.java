package heapSort;

import java.util.Arrays;

public class A_heapSort {
/*	
	다음 성질을 만족하는 이진 트리(binary tree)를 힙(heap)이라고 부른다.
	- 맨 아래 계층은 자식이 없고,
	- 맨 아래 계층과 그 바로 위 계층을 제외한 노드는 자식이 두 개이다.
	- 맨 아래 계층은 왼쪽부터 꽉 채워져 있다.
	- 노드의 값은 자식 노드들의 값보다 작다.
	
	heapSort_최소힙
	cf) 부모 노드의 값이 자식 노드의 값 보다 작은 힙을 최소힙이라고 한다.
	
	int[] a = { 3, 8, 2, 10, 4, 6, 7, 1, 9, 5 };
	실행 결과 : [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
*/
	
	static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void buildHeap(int[] a) {
        int end = a.length - 1;
        for (int i = (end - 1) / 2; i >= 0; --i)
            heapify(a, i, end);
    }

    static void heapify(int[] a, int k, int end) {
        int left = 2 * k + 1, right = 2 * k + 2;
        int smaller;
        if (right <= end)
            smaller = (a[left] < a[right]) ? left : right;
        else if (left <= end) smaller = left;
        else return;
        if (a[smaller] < a[k]) {
            swap(a, smaller, k);
            heapify(a, smaller, end);
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
