
import java.util.*;

public class preorder {
    Node root;

    static class Node {
        int val;
        Node left, right;
        Node (int data) { 
            val = data;
        }
    }

    void doPreorder () {
        if (root == null) return;
        Stack<Node> st = new Stack<Node>();
        st.push(root);

        while (!st.isEmpty()) {
            Node temp = st.pop();
            System.out.print(temp.val + " ");
            if (temp.right != null) st.push(temp.right);
            if (temp.left != null) st.push(temp.left);
        }
    }

    public static void main (String[] args) {
        preorder tree = new preorder();
        tree.root = new Node (1);
        tree.root.left = new Node (2);
        tree.root.right = new Node (7);
        tree.root.left.left = new Node (3);
        tree.root.left.right = new Node (4);
        tree.root.left.right.left = new Node (5);
        tree.root.left.right.right = new Node (6);

        tree.doPreorder();
    }
}