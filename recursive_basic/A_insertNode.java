package recursive_basic;

public class A_insertNode {

/*	
	���� 4 : (insert)
	static void insert(int[] a, int index, int value) �޼ҵ带 �����϶�.
	   �迭 a���� index ��ġ ���� ������ �� ĭ�� �ڷ� �а� (�ݺ������� ����)
	   index ��ġ�� value�� �־��.
	   
	   0 1 2 3 4 -99 5 6 7 8

*/
	
	static void print(int[] a) {
        for (int i : a)
            System.out.printf("%d ", i);
    }

    static void insert(int[] a, int index, int value) {
    		for(int i = a.length-1 ; i>index;--i) {
    			a[i] = a[i-1];
    		}
    		a[index] = value;
    }
    
    static void insert2(int[] a, int index, int value) {
    	int temp1 = value, temp2; 
        for (int i = index; i < a.length; i++) {
            temp2 = a[i];
            a[i] = temp1;
            temp1 = temp2;
        }
}

     /*cf) INSERT �Լ��� ����Լ��� �����ض�*/
    static void insert3(int[] a, int index, int value) {
    	if (index >= a.length) return;  // ���ȣ�� ���� ���� ����
        insert(a, index + 1, a[index]); // ���� �ܰ� �۾� ���ȣ��
        a[index] = value;               // ���� �ܰ� �۾� ����
    }
    
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        for (int i = 0; i < a.length; ++i) {
            a[i] = i;
        	b[i] = i;
        	c[i] = i;
        	}
        insert(a, 5, -99);
        insert2(b, 5, -99);
        insert3(c, 5, -99);
        print(a);
        System.out.println("");
        print(b);
        System.out.println("");
        print(c);

    }
}
