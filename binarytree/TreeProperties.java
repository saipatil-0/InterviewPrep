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
public class TreeProperties {
    
    static int size;

    
    
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.getTree();
        System.out.println("Height of binary tree is => "+heightOfBinaryTree(root)); 
        
        System.out.println("Height of binary tree LevelOrder traversal => "+heightOfBinaryTreeLOT(root)); 
        
        
        System.out.println("Width of binary tree is "); 
        widthOfBinaryTree(root); 
  
        System.out.println("Diameter of binary tree is =>"+diameterOfBinaryTree(root)); 
        
        
         sizeOfBinaryTree(root); 
  
        System.out.println("Size of binary tree is =>"+size); 
       
        
  
  
        
    }
    
    /*
    
    height of binary tree is longest path from root node to leaf node
    params : root
    
    https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
    
    */
    
    public static int heightOfBinaryTree(Node root)
    {
        
        if(root==null)
        {
            return 0;
        }
        
        int lheight = heightOfBinaryTree(root.left);
        int rheight = heightOfBinaryTree(root.right);
        
        return Math.max(rheight,lheight)+1;
        
        
       
        
    }
    
    /*
        https://www.geeksforgeeks.org/maximum-width-of-a-binary-tree/
    */
    public static void widthOfBinaryTree(Node root)
    {
        
    }
    
    /*
    */
    
    public static int diameterOfBinaryTree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        return heightOfBinaryTree(root.left)+heightOfBinaryTree(root.right)+1;
        
    }
    
    
    public static int heightOfBinaryTreeLOT(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        Queue<Node> NodeQ= new LinkedList<Node>();
        
        NodeQ.add(root);
        int height =0;
        
        while(true)
        {
            int nodeCount = NodeQ.size();
            if(nodeCount==0)
            {
                return height;
            }
            else
            {
                height++;
            }
            
            while(nodeCount>0)
            {
                Node newNode =NodeQ.remove();
                
                if (newNode.left != null) {
                    NodeQ.add(newNode.left);
                }
                if (newNode.right != null) {
                    NodeQ.add(newNode.right);
                }
                nodeCount--;

                
            }
        }
        
        
    }
    
    
    public static void sizeOfBinaryTree(Node root)
    {
        
        if(root==null)
        {
            return;
        }
        size++;
        sizeOfBinaryTree(root.left);
        sizeOfBinaryTree(root.right);
        
    }
    
    
    
}
