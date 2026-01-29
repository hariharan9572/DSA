package com.hariharan.tree;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class BinaryTree {

    Node root;

    public void insert(int data) {

        root = insertRec(root, data);

    }

    public Node insertRec(Node root, int data){
        if(root == null)
            root = new Node(data);
        else if(data < root.data)
            root.left = insertRec(root.left, data);
        else if(data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    public void inorder(){
        inorderec(root);
    }

    public void inorderec(Node root){
        if(root != null){
            inorderec(root.left);
            System.out.print(root.data + " ");
            inorderec(root.right);
        }
    }

    public void preorder(){
        preorderec(root);
    }

    public void preorderec(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorderec(root.left);
            preorderec(root.right);
        }
    }

    public void postorder(){
        postorderec(root);
    }

    public void postorderec(Node root){
        if(root != null){
            postorderec(root.left);
            postorderec(root.right);
            System.out.print(root.data + " ");
        }
    }

}
