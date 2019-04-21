package quickSort;

import java.util.Arrays;
import java.util.Random;

public class A_quickSort {
	/*
	
	[7, 9, 4, 14, 11, 1, 8, 12, 9, 5]
	[1, 4, 5, 7, 8, 9, 9, 11, 12, 14]
	
	
	* best case
	partition 메소드가 배열을 정확히 1/2로 나눈다면, 재귀 호출 횟수는 logn 이고,
	quickSort 메소드의 수행 시간은 O(n log n) 이다.

	* worst case
	partition 메소드가 배열을 0 : n-1 크기로 나눈다면, 
	(재귀 호출에서 기준값이 제외되기 때문에, 0 : n 이 아니고, 0 : n-1 이다.)
	재귀 호출 횟수는 n 이다.
	quickSort 메소드의 worst case 수행 시간은 O(n2) 이다.
	
	
	cf) 실무에서 quickSort를 mergeSort보다 많이 사용하는 이유는 무엇인가?
	병합 정렬의 수행시간은 언제나 O(n log⁡n)이다.
	병합 정렬의 메모리 요구량은 O(n) 언제나 이다.

	퀵 정렬의 수행시간은 평균 O(n log⁡n) 이지만, worst case O(n^2) 이다.
	그렇지만 worst case는 극히 드물다.
	퀵 정렬의 메모리 요구량은 O(1) 이다.
	위와 같은 장단점 때문에, 실무에서는 주로 퀵 정렬을 사용한다

	 */	
	static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int[] a, int start, int end) {
        int value = a[end];                    // 기준값
        int i = start - 1;                     // i는 1구역의 끝지점
        for (int j = start; j <= end - 1; ++j) // j는 3구역의 시작 지점
            if (a[j] < value)          // a[j] 값이 1구역에 속하면
                swap(a, ++i, j);       // a[j] 값을 1구역의 끝에 추가한다. 1구역 크기 1증가.
        swap(a, i + 1, end);           // 기준값인 a[end] 원소와 2구역의 시작 원소를 교환한다.
        return i + 1;                  // 기준값 위치 리턴
    }

    static void quickSort(int[] a, int start, int end) {
        if (start >= end) return;
        int middle = partition(a, start, end); // 배열 나누기
        quickSort(a, start, middle-1);         // 1구역 정렬
        quickSort(a, middle+1, end);           // 2구역 정렬
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(20);

        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

}
