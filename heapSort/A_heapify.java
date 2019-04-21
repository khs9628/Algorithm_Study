package heapSort;

public class A_heapify {
	/*
	heapify(int[] a, int index) {  // index 위치의 노드가 heap 성절을 만족하도록 조정
	    자식이 없다면 리턴 // 종료 조건

	    왼쪽 자식 값과 오른쪽 자식 값 중에서 작은 값을 구한다.  // 현재 단계의 작업
	    그 작은 값보다 index 위치의 값이 더 작다면 리턴
	    index 위치의 값이 더 크다면, 두 값을 swap 한다.
	    
	    heapify(a, 작은자식index)  // 다음 단계 재귀 호출
	}
	
	--->자세히 정리해 보자
	
		heapify(int[] a, int index) {  // index 위치의 노드가 heap 성절을 만족하도록 조정
	    leftChildIndex = 2 * index + 1
	    rightChildIndex = 2 * index + 2
	    endIndex = a.length - 1

	    // 자식이 둘 다 있다면, smallIndex를 구한다
	    if (rightChildIndex <= endIndex)
	        smallIndex = a[leftChildIndex] < a[rightChildIndex] ? leftChildIndex : rightChildIndex
	    // 왼쪽 자식만 있다면, 왼쪽 자식이 smallIndex
	    else if (leftChildIndex <= endIndex)
	        smallIndex = leftChildIndex
	    // 자식이 없다면 리턴
	    else return

	    // smallIndex 값보다 index 값이 더 크면 swap
	    if (a[index] > a[smallIndex]) {
	        swap(a, index, smallIndex)        
	        heapify(a, smallIndex) // 다음 단계 재귀 호출
	    }
	}
	 */
	


}
