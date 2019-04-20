package recursive_basic;

public class A_addTail {
	/*	
    문제3 : addTail()
	아래와 같이 출력되도록 addTail 메소드를 구현하라.
	addTail 메소드는 링크드 리스트 끝에 value 값의 Node를 추가해야 한다.

	먼저 반복문으로 addTail 메소드를 구현해 보고,
	그 다음 재귀 호출로 다시 구현하라.
	
	출력 결과 : 0 1 2 3 4 5 6 7 8 9 10 

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
      /*root = new Node(i, root); --- 다름 */ 
      
      root.printAll();
  }

	
}
