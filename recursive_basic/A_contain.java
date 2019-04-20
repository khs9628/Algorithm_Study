package recursive_basic;
import java.util.ArrayList;
import java.util.List;


/*
 	
 	contains 메소드를 구현하라.
	contains 메소드는 트리에서 value를 찾아서 true/false를 리턴해야 한다.
	
	출력결과 :true
		   true
		   false

*/
	
class Node {
    List<Node> children;
    int value;
    
    public Node(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
    
    public void addChild(Node child) {
        this.children.add(child);
    }
    
   
    public boolean contains(int value) {
        if (this.value == value) return true;
        for (Node child : this.children)
            if (child.contains(value)) return true;
        return false;
    }
}

public class A_contain {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        node1.addChild(new Node(15));

        Node node2 = new Node(17);
        node2.addChild(new Node(18));
        node2.addChild(new Node(16));
        
        Node node3 = new Node(25);
        node3.addChild(new Node(3));
        node3.addChild(node1);
        node3.addChild(node2);
        
        Node node4 = new Node(30);
        node4.addChild(new Node(4));
        
        Node root = new Node(5);
        root.addChild(node3);
        root.addChild(node4);
        
        System.out.println(root.contains(15));
        System.out.println(root.contains(4));
        System.out.println(root.contains(40));
    }
	
}

