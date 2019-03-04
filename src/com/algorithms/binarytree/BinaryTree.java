package com.algorithms.binarytree;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private int data;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    TreeNode insertRec(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
            return root;
        }

        if(data < root.data){
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }
    public static void main(String[] args){
        BinaryTree binTree = new BinaryTree();
        binTree.insert(8);
        binTree.insert(3);
        binTree.insert(10);
        binTree.insert(1);
        binTree.insert(6);
        binTree.insert(4);
        binTree.insert(7);
        binTree.insert(14);
        binTree.insert(13);

    }
}
