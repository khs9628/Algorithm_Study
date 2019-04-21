package quickSort;

import java.util.Arrays;
import java.util.Random;

public class A_partition {
	/*
	
	Q) 임의의 값을 기준으로, 
	       기준값보다 작은 값들은 배열의 앞부분으로 이동하고,
	       기준값보다 큰 값들은 배열의 뒷부분으로 이동하는 알고리즘을 구현하자.
	
	partition(A[ ], p, r)
	{
	    x ← A[r];                        ▷ 기준원소 (pivot)
	    i ← p-1;                         ▷ i는 1구역의 끝지점
	    for j ← p to r-1                 ▷ j는 3구역의 시작 지점
	      if (A[j] ≤ x) then A[++i] ↔ A[j];               
	                                      ▷ i 값 증가 후 A[i] ↔ A[j] 교환
	    A[i+1] ↔ A[r];                   ▷ 기준 원소와 2구역 첫원소 교환
	    return i+1;                       ▷ 기준 원소의 위치 리턴
	}
	
	ex) 출력 결과  7(a[end]) 값이 기준 값으로 지정 -> 7이상은 오른쪽 미만은 왼쪽으로 정렬된다.
	[4, 14, 15, 5, 0, 5, 13, 9, 18, 7]
	[4, 5, 0, 5] [7, 14, 13, 9, 18, 15]
	수행 시간 : O(n) 
	
	cf)기준값이, 배열의 최소값인 경우에 partition 결과는 어떻게 되는가?
	       기준값이, 배열의 최대값인 경우에 partition 결과는 어떻게 되는가?   -> 최악의 결과를 가지게 된다.

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
