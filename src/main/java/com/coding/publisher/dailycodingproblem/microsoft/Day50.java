package com.coding.publisher.dailycodingproblem.microsoft;

public class Day50 {

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree(new Node("*"));
        bt.root.left = new Node("+");
        bt.root.right = new Node("+");
        bt.root.left.left = new Node("3");
        bt.root.left.right = new Node("2");
        bt.root.right.left = new Node("4");
        bt.root.right.right = new Node("5");
        System.out.println(bt.evaluateBinaryTree(bt.root));
    }
}


class BinaryTree {
    Node root;
    static int preIndex = 0;
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String TIMES = "*";
    private static final String DIVIDE = "/";

    public BinaryTree() {
    }
    public BinaryTree(Node root) {
        this.root = root;
    }

   public static String evaluateBinaryTree(Node node){

        switch (node.val){
            case PLUS:

                return String.valueOf(Integer.parseInt(evaluateBinaryTree(node.left))
                        + Integer.parseInt(evaluateBinaryTree(node.right)));

            case MINUS:
                return String.valueOf(Integer.parseInt(evaluateBinaryTree(node.left))
                        - Integer.parseInt(evaluateBinaryTree(node.right)));

            case TIMES:
                return String.valueOf(Integer.parseInt(evaluateBinaryTree(node.left))
                        * Integer.parseInt(evaluateBinaryTree(node.right)));

            case DIVIDE:
                return String.valueOf(Integer.parseInt(evaluateBinaryTree(node.left))
                        / Integer.parseInt(evaluateBinaryTree(node.right)));

            default:
                return node.val;
        }

    }
}

class Node {
    Node left;
    Node right;
    String val;

    public Node(String item) {
        val = item;
        left = null;
        right = null;
    }
}
