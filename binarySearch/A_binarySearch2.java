package binarySearch;

import java.util.Random;

public class A_binarySearch2 {
	
/*	
    BinarySearch ( 이진탐색 ) 
  	입력 배열의 중간 값과 찾을 값을 비교한다.
	비교 결과 찾을 값이 크면, 중간 값을 기준으로 뒤쪽에서 찾는다.
	          찾을 값이 작으면, 중간 값을 기준으로 앞쪽에서 찾는다.
	          값이 동일하면 찾기 종료

*/	
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
        // O(logn)
        public void add(int value) {
            if (value < this.value) {
                if (left == null) left = new Node(value);
                else left.add(value);
            } else if (value > this.value) {
                if (right == null) right = new Node(value);
                else right.add(value);
            }
        }

        public void print() {
            if (left != null) left.print();
            System.out.printf("%d ", value);
            if (right != null) right.print();
        }
        
//      파리미터 값 value가 이진 트리에 들어있는지 여부를 true/false로 리턴하는 contains 메소드를 구현하라.
        public boolean contains(int value) {
            if (value < this.value) {
                if (left == null) return false;
                return left.contains(value);
            }
            else if (value > this.value) {
                if (right == null) return false;
                return right.contains(value);
            }
            return true;
        }
        
        /*
          
        if (value < this.value) 
            return left != null && left.contains(value);
        else if (value > this.value) 
            return right != null && right.contains(value);
        return true;
        
        */
    }

    public static void main(String[] args) {
        Random random = new Random();
        Node root = new Node(random.nextInt(20));
        for (int i = 0; i < 15; ++i)
            root.add(random.nextInt(20));

        root.print();
        System.out.println();

        for (int i = 0; i < 20; ++i) {
            int value = random.nextInt(20);
            System.out.printf("%d %s\n", value, root.contains(value));
        }

    }

}

