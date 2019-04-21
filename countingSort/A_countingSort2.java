package countingSort;

public class A_countingSort2 {
	
    public static void countingSort(char[] a) {
        int[] counts = new int['z' - 'a' + 1];
        for (char c : a) // �� ������ ���� ����
            ++counts[c - 'a'];
        int index = 0; // �迭�� ���� ä��� ���� �ε���
        for (int i = 0; i < counts.length; ++i) // �� ������ �� ��ŭ �迭�� ä���
            for (int j = 0; j < counts[i]; ++j)
                a[index++] = (char)('a' + i);
    }

    public static void main(String[] args) {
        char[] a = "helloworldgoodmorninghowareyou".toCharArray();
        countingSort(a);
        System.out.printf("[%s]\n", new String(a));
    }

	
}
