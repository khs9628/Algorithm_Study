package countingSort;

import java.util.Map;
import java.util.TreeMap;

public class A_countingSort {
	/*
	 countingSort
	(1) ������ �迭�� ����ִ� ���� ������ ���� ���� ���� count �迭�� �����Ѵ�.
	���� ������ ���� �ʴٸ�, count �迭�� ũ�⵵ ũ�� ���� ���̴�.

	(2) ������ �迭�� ���� Ž���ϸ�, �� ������ ���� ����.

	(3) �� ������ ���� �˰� �ִٴ� ����, ���� ��� �迭�� �� ������ ������� �� ���� ����־�� �ϴ��� �ȴٴ� ���̴�. ���� ��� �迭�� �����Ѵ�.
	 */    
	
	public static void countingSort(char[] a) {
        Map<Character, Integer> countMap = new TreeMap<>();
        for (char c : a) { // �� ������ ���� ����
            Integer i = countMap.get(c);
            if (i == null) i = 0;
            countMap.put(c, i + 1);
        }
        int index = 0; // �迭�� ���� ä��� ���� �ε���
        for (char c : countMap.keySet()) { // �� ������ �� ��ŭ �迭�� ä���
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
