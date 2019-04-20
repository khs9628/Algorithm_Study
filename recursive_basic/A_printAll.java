package recursive_basic;

public class A_printAll {
	/*	
  	
  	���� 2 : printAll()
  	�Ʒ��� ���� ��µǵ��� printAll �޼ҵ带 �����϶�.
	���� �ݺ������� printAll �޼ҵ带 ������ ����,
	�� ���� ��� ȣ��� �ٽ� �����϶�
	��� ��� : 10 9 8 7 6 5 4 3 2 1 
	 
	 */	
	
	 static class Node {
	        int value;
	        Node next;

	        public Node(int value, Node next) {
	            this.value = value;
	            this.next = next;
	        }

	        public void printAll() {
	        	System.out.print(this.value+" ");
	        	if(next != null)
	        	next.printAll();
	        }
	    }

	    public static void main(String[] args) {
	        Node root = null;
	        for (int i = 1; i <= 10; ++i)
	            root = new Node(i, root);

	        root.printAll();
	    }
}
