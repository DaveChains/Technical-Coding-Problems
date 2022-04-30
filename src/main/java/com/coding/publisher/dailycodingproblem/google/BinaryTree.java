package com.coding.publisher.dailycodingproblem.google;
import java.util.Arrays;

class Node {
    Node left;
    Node right;
    char data;


    public Node(char item) {
        data = item;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    Node root;
    static int preIndex = 0;

    Node buildTree(char[] in, char[]pre, int inStart, int inEnd){
        if(inStart > inEnd)
            return null;

        Node tNode = new Node(pre[preIndex++]);

        if(inStart == inEnd)
            return tNode;

        int inIndex = search(in, inStart, inEnd, tNode.data);

        tNode.left = buildTree(in, pre, inStart, inIndex-1);
        tNode.right = buildTree(in, pre,inIndex+1 , inEnd);

        return tNode;
    }
    void printInOder(Node node){

        if(node == null){
            return;
        }

        printInOder(node.left);
        System.out.println(node.data + " ");
        printInOder(node.right);

    }
    int search(char[] arr, int start, int end, char value){
        int i;
        for(i = start; i <= end; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return i;
    }

    private static void assertInOrderTraversalThree(){
        BinaryTree tree = new BinaryTree();
        char[] inOrderTree = new char[]{'d', 'b', 'e', 'a', 'f', 'c', 'g'};
        char[] preOrderTree = new char[]{'a', 'b', 'd', 'e', 'c', 'f', 'g'};
        int len = inOrderTree.length;
        Node root = tree.buildTree(inOrderTree, preOrderTree,0, len-1);

        System.out.println("In order transversal constructed three is");
        tree.printInOder(root);

    }

    public static void main(String[] args){
        char[] preOrderTree = new char[]{'a', 'b', 'd', 'e', 'c', 'f', 'g'};
        char[] inOrderTree = new char[]{'d', 'b', 'e', 'a', 'f', 'c', 'g'};

//        For example, given the following preorder traversal:
//
//        [a, b, d, e, c, f, g]
//          And the following inorder traversal:
//
//        [d, b, e, a, f, c, g]
//        assertInOrderTraversalThree();
//        Result:
//            a
//           / \
//          b   c
//         / \ / \
//        d  e f  g

        reconstruct(preOrderTree, inOrderTree);
    }

    private static Node reconstruct(char[] preOrderTree, char[] inOrderTree){
        if(preOrderTree.length == 0 && inOrderTree.length == 0){
            return null;
        }
        if ((preOrderTree.length == inOrderTree.length)
                && preOrderTree.length  == 1
                && inOrderTree.length  == 1){
//            return preOrderTree[0];
        }

        Node tNode = new Node(preOrderTree[preIndex]);
        int rootI = Arrays.binarySearch(inOrderTree, preOrderTree[preIndex] );
        tNode.left = reconstruct(preOrderTree, inOrderTree);
        tNode.right = reconstruct(preOrderTree, inOrderTree);

        return null;

    }

}
