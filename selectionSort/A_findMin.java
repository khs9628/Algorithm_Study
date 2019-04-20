package selectionSort;

public class A_findMin {
    /*
	위 예제의 실행 결과 출력이 아래와 같도록 findMin 메소드를 구현하라
	출력 결과 : 11
			-19
	*/
	
	static int findMin(int[] a) {
        int minValue = a[0];
        int minIndex = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < minValue) {
                minValue = a[i];
                minIndex = i;
            }
        }
        return minIndex;

    }

    public static void main(String[] args) {
        int[] a1 = { 17, 14, 11, 19 };
        int[] a2 = { -17, -14, -11, -19 };

        int minIndex = findMin(a1);
        System.out.println(a1[minIndex]);

        minIndex = findMin(a2);
        System.out.println(a2[minIndex]);
    }

}
