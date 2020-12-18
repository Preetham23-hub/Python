import java.util.*;

public class Test {
    static Scanner sc = null;

    public static void main(String[] args) {
        Node root = createTree();
        System.out.println(root.data);

    }

    static Node createTree() {
        Node root = null;
        System.out.println("enter the data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("enter the left for " + data);
        root.left = createTree();
        System.out.println("enter the right for " + data);
        root.right = createTree();

        return root;

    }

}

 class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;

    }

}
