package recursive_basic;

public class A_removeNode {
	/*	
	
	static void remove(int[] a, int index) �޼ҵ带 �����϶�.
	   �迭 a���� index ��ġ ���� ������ �� ĭ�� ������ ���� (�ݺ������� ����)
	   �迭�� ���� 0�� �����϶�.
	   ��� ��� : 0 1 2 3 4 6 7 8 9 0
	
	*/	
	
    static void print(int[] a) {
        for (int i : a)
            System.out.printf("%d ", i);
    }

    static void remove(int[] a, int index) {
    	for(int i = index ;i<a.length-1; i++)
    	a[i] = a[i+1];
    	a[a.length-1] = 0;
    }	
    
    /* cf) remove�Լ��� ����Լ��� �����Ͽ��� */
    static void remove2(int[] a, int index) {
    	if (index == a.length - 1) {
            a[index] = 0;
            return;
        }
        a[index] = a[index + 1];
        remove(a, index + 1);
    }	
    
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i)
            a[i] = i;

        remove(a, 5);

        print(a);

    }
}
