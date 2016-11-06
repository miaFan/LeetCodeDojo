package com.thoughtworks.fmt;

public class BinaryTree {
    public int data;
    public BinaryTree leftSubtree;
    public BinaryTree rightSubtree;


    public static Boolean lookup(BinaryTree tree, int target) {
        if(tree == null) return false;
//        if(tree.data == target) {
//            return true;
//        }else {
//            if(target <= tree.data){
//                return lookup(tree.leftSubtree, target);
//            }else {
//                return lookup(tree.rightSubtree, target);
//            }
//        }

        boolean hasNotFound = false;

        BinaryTree currentTree = new BinaryTree();
        while(currentTree != null) {
            if(currentTree.data == target) {
                hasNotFound = true;
                currentTree = null;
                break;
            }
            if(target <= tree.data) {
                currentTree = tree.leftSubtree;
            }else {
                currentTree = tree.rightSubtree;
            }
        }

        return hasNotFound;
    }

    private static class Node {
        Node left;
        Node right;
        int data;

        Node(int newData) {
            left = null;
            right = null;
            data = newData;
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Boolean result = BinaryTree.lookup(binaryTree, 1);

        System.out.println("The result is:"+result);
    }
}
