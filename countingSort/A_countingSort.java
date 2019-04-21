package countingSort;

import java.util.Map;
import java.util.TreeMap;

public class A_countingSort {
	/*
	 countingSort
	(1) 정렬할 배열에 들어있는 값들 각각의 수를 세기 위한 count 배열을 생성한다.
	값의 종류가 많지 않다면, count 배열의 크기도 크지 않을 것이다.

	(2) 정렬할 배열을 선형 탐색하며, 각 값들의 수를 센다.

	(3) 각 값들의 수는 알고 있다는 것은, 정렬 결과 배열에 각 값들이 순서대로 몇 개씩 들어있어야 하는지 안다는 것이다. 정렬 결과 배열을 생성한다.
	 */    
	
	public static void countingSort(char[] a) {
        Map<Character, Integer> countMap = new TreeMap<>();
        for (char c : a) { // 각 문자의 수를 센다
            Integer i = countMap.get(c);
            if (i == null) i = 0;
            countMap.put(c, i + 1);
        }
        int index = 0; // 배열에 값을 채우기 위한 인덱스
        for (char c : countMap.keySet()) { // 각 문자의 수 만큼 배열에 채운다
            for (int i = 0; i < countMap.get(c); ++i)
                a[index++] = c;
        }
    }

    public static void main(String[] args) {
        char[] a = "hello world. good morning. how are you.".toCharArray();
        countingSort(a);
        System.out.printf("[%s]\n", new String(a));
    }

	
}
