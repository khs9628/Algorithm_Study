package sort_Example;

import java.util.Arrays;

public class sort_odd_Or_even_partition {
	/*
	quick sort ������ partition �޼ҵ� ����
	int[] a = [0, 2, 4, 6, 1, 5, 3, 7]
	��� ��� : int[] a = {0, 1, 2, 3, 4, 5, 6, 7}
	�ð� ���⵵ : O(n)
	 */
	
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    
    // 2�� ���������ٸ� (¦�����) index - 1 �� ��ġ�� swap��Ű�� �׷��� �ʴٸ� (Ȧ�����) continue
    static void partition(int[] a) {
        int j = -1;
        for (int i = 0; i < a.length - 1; ++i)
            if (a[i] % 2 == 0)
                swap(a, ++j, i);
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7};
        partition(a);
        System.out.println(Arrays.toString(a));
    }

}
