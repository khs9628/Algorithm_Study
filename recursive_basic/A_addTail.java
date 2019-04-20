package recursive_basic;

public class A_addTail {
	/*	
    ����3 : addTail()
	�Ʒ��� ���� ��µǵ��� addTail �޼ҵ带 �����϶�.
	addTail �޼ҵ�� ��ũ�� ����Ʈ ���� value ���� Node�� �߰��ؾ� �Ѵ�.

	���� �ݺ������� addTail �޼ҵ带 ������ ����,
	�� ���� ��� ȣ��� �ٽ� �����϶�.
	
	��� ��� : 0 1 2 3 4 5 6 7 8 9 10 

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

      public void addTail(int value) {
          if (next != null) next.addTail(value);
          else next = new Node(value, null);
      }
  }


  public static void main(String[] args) {
      Node root = new Node(0, null);
      for (int i = 1; i <= 10; ++i)
          root.addTail(i);
      /*root = new Node(i, root); --- �ٸ� */ 
      
      root.printAll();
  }

	
}
