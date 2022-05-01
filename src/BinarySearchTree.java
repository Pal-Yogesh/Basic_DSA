//import java.util.Scanner;
//
//public class BinarySearchTree {
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data) {
//            this.data = data;
//        }
//
//        public static Node insert(Node root, Node newnode) {
//            Scanner sc = new Scanner(System.in);
//            int val = sc.nextInt();
////            Node newnode = new Node(val);
//            if (root == null) {
//                root = newnode;
//                return root;
//            }
//            if (root.data > newnode.data) {
//                if (root.left == null) {
//                    root.left = newnode;
//                }
//            } else {
//                insert(root.left, newnode);
//            }
//            if (root.data < newnode.data) {
//                if (root.right == null) {
//                    root.right = newnode;
//                } else insert(root.right, newnode);
//            }
//            return root;
//        }
//    }
//
//public static boolean search(Node root,Node newnode) {
//    boolean result;
//    if (root == null) {
//        return false;
//    }
//    if (root.data == newnode.data)
//        return true;
//    if (root.data > newnode.data)
//        result = search(root.left, newnode);
//    if (root.data < newnode.data) {
//        result = search(root.right, newnode);
//        return result;
//    }
//}
//
//    public static void main(String[] args) {
//        Node rootNode = new Node(50);
//        insert(null,rootNode);
//        Node rootleft = newNode(30);
//        insert(rootNode,rootleft);
//        Node n2 = newNode(45);
//        insert(rootNode,n2);
//        insert(rootNode,56);
//    }}
