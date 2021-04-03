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
public class ViewsOfTree {
    
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.getTree();
        
        System.out.println("Print Left view : ");
        
        leftViewofTree(root);
        
        System.out.println("Print Right view : ");
        
        rightViewofTree(root);
    }
    
    public static void leftViewofTree(Node root)
    {
        
        if(root==null)
        {
            return;
        }
        
        System.out.print(root.value);
        
        if(root.left!=null)
        {
            leftViewofTree(root.left);
            
        }
        else if(root.right!=null)
        {
            leftViewofTree(root.right);
            
        }
        
    }
    
    public static void rightViewofTree(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.value+"\t");
        if(root.right!=null)
        {
            rightViewofTree(root.right);
        }
        else if(root.left!=null)
        {
            rightViewofTree(root.left);
        }
    }
    
}
