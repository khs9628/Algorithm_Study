package recursive_basic;

public class A_insertNode {

/*	
	문제 4 : (insert)
	static void insert(int[] a, int index, int value) 메소드를 구현하라.
	   배열 a에서 index 위치 뒤의 값들을 한 칸씩 뒤로 밀고 (반복문으로 구현)
	   index 위치에 value를 넣어라.
	   
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

     /*cf) INSERT 함수를 재귀함수로 구현해라*/
    static void insert3(int[] a, int index, int value) {
    	if (index >= a.length) return;  // 재귀호출 종료 조건 구현
        insert(a, index + 1, a[index]); // 다음 단계 작업 재귀호출
        a[index] = value;               // 현재 단계 작업 구현
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
