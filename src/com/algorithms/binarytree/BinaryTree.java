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

    public void insert(int data){
        root = insertRec(root, data);
    }

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
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

        System.out.println("---- Preorder traversal of the tree ----");
        binTree.preOrder(binTree.root);
        System.out.println();

        System.out.println("---- Inorder traversal of the tree ----");
        binTree.inOrder(binTree.root);
    }
}
