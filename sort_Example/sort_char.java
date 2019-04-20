package sort_Example;

import java.util.Arrays;

public class sort_char {
	/*
		�Է�: ���� �迭 char[] a
		���: ������������ �迭 �����ϱ�.
		Java ǥ�� ���̺귯���� Arrays.sort �޼ҵ带 �̿��Ͽ� ����
		�ð� ���⵵ : O(n2)
		char[] a = "hello world!"
		��� ��� : [ , !, d, e, h, l, l, l, o, o, r, w]
	 */
    static void sort(char[] a) {
        Arrays.sort(a); // O(N logN)
    }

    public static void main(String[] args) {
        char[] a = "hello world!".toCharArray();
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}

