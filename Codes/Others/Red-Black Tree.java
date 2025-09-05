// Question: Write a Java program to implement Red-Black Tree (Insertion + Inorder Traversal).

import java.util.*;

class RBNode {
    int data;
    RBNode left, right, parent;
    boolean color; // true = Red, false = Black
    RBNode(int data) {
        this.data = data;
        left = right = parent = null;
        color = true; 
    }
}

public class RedBlackTree {
    private RBNode root;
    private RBNode TNULL;

    public RedBlackTree() {
        TNULL = new RBNode(0);
        TNULL.color = false;
        root = TNULL;
    }

    private void leftRotate(RBNode x) {
        RBNode y = x.right;
        x.right = y.left;
        if (y.left != TNULL) y.left.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;
        y.left = x;
        x.parent = y;
    }

    private void rightRotate(RBNode x) {
        RBNode y = x.left;
        x.left = y.right;
        if (y.right != TNULL) y.right.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.right) x.parent.right = y;
        else x.parent.left = y;
        y.right = x;
        x.parent = y;
    }

    private void fixInsert(RBNode k) {
        while (k.parent != null && k.parent.color) {
            if (k.parent == k.parent.parent.right) {
                RBNode u = k.parent.parent.left;
                if (u.color) {
                    u.color = false;
                    k.parent.color = false;
                    k.parent.parent.color = true;
                    k = k.parent.parent;
                } else {
                    if (k == k.parent.left) {
                        k = k.parent;
                        rightRotate(k);
                    }
                    k.parent.color = false;
                    k.parent.parent.color = true;
                    leftRotate(k.parent.parent);
                }
            } else {
                RBNode u = k.parent.parent.right;
                if (u.color) {
                    u.color = false;
                    k.parent.color = false;
                    k.parent.parent.color = true;
                    k = k.parent.parent;
                } else {
                    if (k == k.parent.right) {
                        k = k.parent;
                        leftRotate(k);
                    }
                    k.parent.color = false;
                    k.parent.parent.color = true;
                    rightRotate(k.parent.parent);
                }
            }
        }
        root.color = false;
    }

    public void insert(int key) {
        RBNode node = new RBNode(key);
        node.left = node.right = TNULL;
        RBNode y = null, x = root;

        while (x != TNULL) {
            y = x;
            if (node.data < x.data) x = x.left;
            else x = x.right;
        }

        node.parent = y;
        if (y == null) root = node;
        else if (node.data < y.data) y.left = node;
        else y.right = node;

        if (node.parent == null) { node.color = false; return; }
        if (node.parent.parent == null) return;
        fixInsert(node);
    }

    private void inorder(RBNode node) {
        if (node != TNULL) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void inorder() { inorder(root); }

    public static void main(String[] args) {
        RedBlackTree rbt = new RedBlackTree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter keys:");
        for (int i = 0; i < n; i++) rbt.insert(sc.nextInt());

        System.out.println("Inorder traversal of Red-Black Tree:");
        rbt.inorder();
        sc.close();
    }
}
