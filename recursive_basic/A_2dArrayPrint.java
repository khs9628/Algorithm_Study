package recursive_basic;

public class A_2dArrayPrint {
/*	
	출력 결과 :  1 2 3 
			 4 5 6 
			 7 8 9 

*/	
	static void print1(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j)
                System.out.printf("%d ", a[i][j]);
            System.out.println();
        }
    }
    
    //재귀적 함수로 print1과 같이 2차원 배열을 출력하는 함수를 만드시오.
    static void print2(int[][] a, int i, int j) {
        if (i >= a.length) return;
        System.out.printf("%d ", a[i][j]);
        if (j < a[i].length - 1)
            print2(a, i, j + 1);
        else {
            System.out.println();
            print2(a, i + 1, 0);
        }
    }

    public static void main(String[] args) {
    	int[][] a = {{ 1, 2, 3 }, {4, 5, 6}, {7, 8, 9} };
    	print1(a);
	System.out.println();
    	print2(a, 0, 0);
    }

}
