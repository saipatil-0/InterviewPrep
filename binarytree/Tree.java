/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

/**
 *
 * @author saipati
 */
public class Tree {
    
    
    Node root;
    
    //TODO : form  tree from array
    public void formTree(Integer[] arr)
    {
        if(arr.length==0)
        {
            return;
        }
        this.root = new Node(arr[0]);
        
        for(int i=1;i<arr.length;i++)
        {
            
        }
        
    }
    
    
    public Node getTree()
    {
        
        this.root = new Node(1); 
        this.root.left = new Node(2); 
        this.root.right = new Node(3); 
        this.root.left.left = new Node(4); 
        this.root.left.right = new Node(5); 
  
        return this.root;
        
    }
    
    
    
    
    
}
