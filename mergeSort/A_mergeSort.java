package mergeSort;

import java.util.Arrays;

public class A_mergeSort {
	/*	
	mergeSort(A[ ], start, end) 
	{ 
	        if (start < end) then {                   정렬할 부분의 크기가 1 이하이면, 그냥 리턴한다.
	                middle ← (start + end)/2;		(1)  start, end의 중간 지점 계산 
	                mergeSort(A, start, middle);  	(2)  중간 지점을 기준으로 앞부분 정렬 
	                mergeSort(A, middle+1, end); 	(3)  중간 지점을 기준으로 뒷부분 정렬 
	                merge(A, start, middle, end); 	(4)  병합 
	        } 
	} 

	merge(A[ ], start, middle, end) 
	{ 
	        정렬되어 있는 두 배열 A[start ... middle]와 A[middle+1 ... end]을 합하여 
	        정렬된 하나의 배열 A[start ... end]을 만든다. 
	}
	
	int[] a = { 31, 3, 65, 73, 8, 11, 20, 29, 48, 15};
	출력 결과 : [3, 8, 11, 15, 20, 29, 31, 48, 65, 73]
	
	mergeSort 수행시간 : O(n log n) 
	*/ 
	
    // a 배열에서 start 에서 end 사이의 값을 정렬한다.
    static void mergeSort(int[] a, int start, int end) {
        if (start == end) return;        // 정렬할 부분의 길이가 1 이면 그냥 리턴한다.
        int middle = (start + end) / 2;  // start와 end 사이 중간지점을 계산한다.
        mergeSort(a, start, middle);     // 앞부분을 정렬하기 위한 재귀 호출
        mergeSort(a, middle + 1, end);   // 뒷부분을 정렬하기 위한 재귀 호출
        merge(a, start, middle, end);    // 앞부분과 뒷부분 병합
    }

    // a 배열에서 앞부분(start ~ middle)과 뒷부분(middle+1 ~ end)을 병합한다.
    static void merge(int[] a, int start, int middle, int end) {
        int length = end - start + 1;   // 병합할 부분의 길이를 구한다.
        int[] temp = new int[length];   // 병합 결과를 저정할 임시 배열을 생성한다.
        int i = 0;                      // 임시 배열에 대한 인덱스 변수
        int index1 = start;             // 앞부분(start ~ middle)에 대한 인덱스 변수
        int index2 = middle + 1;        // 뒷부분(middle+1 ~ end)에 대한 인덱스 변수

        while (index1 <= middle && index2 <= end) { // 병합할 값이 앞부분과 뒷부분에 둘 다 남아 있다면
            if (a[index1] < a[index2])              // 앞부분과 뒷부분의 선두의 값을 비교하여
                temp[i++] = a[index1++];            // 더 작은 값이 임시 배열에 먼저 들어간다
            else
                temp[i++] = a[index2++];
        }
        while (index1 <= middle)             // 앞부분 배열에 남아있는 값을 임시 배열에 넣는다.
            temp[i++] = a[index1++];
        while (index2 <= end)                // 뒤부분 배열에 남아있는 값을 임시 배열에 넣는다.
            temp[i++] = a[index2++];
        for (i = 0; i < temp.length; ++i)    // 임시 배열의 내용을 a 배열의 start 위치에 복사한다.
            a[start + i] = temp[i];
    }

    public static void main(String[] args) {
        int[] a = { 31, 3, 65, 73, 8, 11, 20, 29, 48, 15};

        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

	
}
