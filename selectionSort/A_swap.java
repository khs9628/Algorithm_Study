package selectionSort;

import java.util.Arrays;

public class A_swap {
    
/*	
           �� ������ ���� ��� ����� �Ʒ��� ������ swap �޼ҵ带 �����϶�.
 	  ��� ��� : [2, 4]
			 [4, 2]
*/	
	
	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
    static void swap(int[] a, int i, int j) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }

    public static void main(String[] args) {
        int[] a = { 2, 4 };

        System.out.println(Arrays.toString(a));
        swap(a, 0, 1);
        System.out.println(Arrays.toString(a));
    }

}

