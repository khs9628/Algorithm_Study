package heapSort;

public class A_heapify {
	/*
	heapify(int[] a, int index) {  // index ��ġ�� ��尡 heap ������ �����ϵ��� ����
	    �ڽ��� ���ٸ� ���� // ���� ����

	    ���� �ڽ� ���� ������ �ڽ� �� �߿��� ���� ���� ���Ѵ�.  // ���� �ܰ��� �۾�
	    �� ���� ������ index ��ġ�� ���� �� �۴ٸ� ����
	    index ��ġ�� ���� �� ũ�ٸ�, �� ���� swap �Ѵ�.
	    
	    heapify(a, �����ڽ�index)  // ���� �ܰ� ��� ȣ��
	}
	
	--->�ڼ��� ������ ����
	
		heapify(int[] a, int index) {  // index ��ġ�� ��尡 heap ������ �����ϵ��� ����
	    leftChildIndex = 2 * index + 1
	    rightChildIndex = 2 * index + 2
	    endIndex = a.length - 1

	    // �ڽ��� �� �� �ִٸ�, smallIndex�� ���Ѵ�
	    if (rightChildIndex <= endIndex)
	        smallIndex = a[leftChildIndex] < a[rightChildIndex] ? leftChildIndex : rightChildIndex
	    // ���� �ڽĸ� �ִٸ�, ���� �ڽ��� smallIndex
	    else if (leftChildIndex <= endIndex)
	        smallIndex = leftChildIndex
	    // �ڽ��� ���ٸ� ����
	    else return

	    // smallIndex ������ index ���� �� ũ�� swap
	    if (a[index] > a[smallIndex]) {
	        swap(a, index, smallIndex)        
	        heapify(a, smallIndex) // ���� �ܰ� ��� ȣ��
	    }
	}
	 */
	


}
