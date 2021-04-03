/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author saipati
 */
public class AllTraversals {
      //Binary tree should have a root that has left and right pointers and data
    
    
    public static void main(String[] args) {
        
        
        Tree tree = new Tree(); 
        Node root = tree.getTree();
        
        System.out.println("Preorder traversal of binary tree is "); 
        printPreorder(root); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        printInorder(root); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        printPostorder(root); 
        
        
        System.out.println("\nLevelOrder traversal of binary tree is "); 
        printLevelorder(root); 
    }
    
    
    
    public static void printPreorder(Node root)
    {
        //preorder => root -> left -> right
        
        if(root ==null)
        {
            return;
        }
        System.out.print(root.value + "\t");
        printPreorder(root.left);
        printPreorder(root.right);
        
        
        
    }
    
    
    public static void printInorder(Node root)
    {
        //in order left -> root -> roght
        if(root ==null)
        {
            return;
        }
        
        printInorder(root.left);
        System.out.print(root.value+ "\t");
        printInorder(root.right);
    }
    
    
    public static void printPostorder(Node root)
    {
        
        //post  order left -> right -> root 
        if(root ==null)
        {
            return;
        }
        
        printInorder(root.left);
       
        printInorder(root.right);
         System.out.print(root.value+ "\t");
        
    }
    
    public static void printLevelorder(Node root)
    {
        if(root ==null)
        {
            return;
            
        }
        
        Queue<Node> nodeQ = new LinkedList<Node>();
        nodeQ.add(root);
        
        while(!nodeQ.isEmpty())
        {
            Node n = nodeQ.remove();
            System.out.print(n.value+ "\t");
            if(n.left!=null)
            {
                nodeQ.add(n.left);
            }
            if(n.right!=null)
            {
                nodeQ.add(n.right);
            }
        }
        
        
        
        
        
    }
    
    
    
    //inner class Node
    
    
    /*static class Node<T>{
        
        Node left;
        Node right;
        T value;

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
        
        Node(T value)
        {
            this.value = value;
            
            
        }
    
}*/
    
    
}



