package recursive_basic;

public class A_2dArrayPrint {
    static void print1(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j)
                System.out.printf("%d ", a[i][j]);
            System.out.println();
        }
    }
    
    //����� �Լ��� print1�� ���� 2���� �迭�� ����ϴ� �Լ��� ����ÿ�.
    static void print2(int[][] a, int i, int j) {

    }

    public static void main(String[] args) {
    	int[][] a = {{ 1, 2, 3 }, {4, 5, 6}, {7, 8, 9} };
    	print1(a);
	System.out.println();
    	print2(a, 0, 0);
    }

}
