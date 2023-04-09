package interview;

import java.util.*;



class Node
{
    int data;
    Node left, right;
 
    public Node(int data)
    {
    	this.data= data;
        left = right = null;
    }
}	



public class binary_tree {
	
	
//	static void postOrder(Node root) {
//    	if(root == null) 
//    		return;
//    	
//    	postOrder(root.left);
//    	postOrder(root.right);
//    	System.out.print(root.data + " ");
//    }
//	
//	
//	static void inOrder(Node root)
//    {
//        if (root == null)
//            return;
//
//        inOrder(root.left);
//        System.out.print(root.data + " ");
//        inOrder(root.right);
//    }
//	
//    
    static int height(Node root) {
    	if(root==null) {
    		return 0;
    	}
    	return (Math.max(height(root.left), height(root.right))+1);
    }
//
//    
//    static int count;
//    static int size(Node root) {
//    	if(root==null) {
//    		return 0;
//    	}
//    	count++;
//    	size(root.left);
//    	size(root.right);
//    	return count;
//    }
    
    
//    static int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
//    static void maxmin(Node root) {
//    	if(root==null) {
//    		return;
//    	}
//    	else {
//    		if(max<root.data) {
//    			max=root.data;
//    		}
//    		if(min>root.data) {
//    			min=root.data;
//    		}
//    	}
//    	maxmin(root.left);
//    	maxmin(root.right);
//    }
//
//    
    static void levelorder(Node root,int i) {
    	if(root!=null) {
    		if(i==0) {
        		return;
        	}
        	else if(i==1) {
        		System.out.print(root.data+" ");
        	}
        	else {
        		levelorder(root.left, i-1);
        		levelorder(root.right,i-1);
        	}
    	}  
    }
//    
//    
//  static void levelorder(HashMap map,Node root,int i,int a) {
//	  //map.putIfAbsent(i,root.data);
//	  
//	  if(root!=null) {
//		if(i==0) {
//    		return;
//    	}
//    	else if(i==1) {
//    		map.putIfAbsent(a,root.data);
//    		a++;
//    	}
//    	else {
//    		levelorder(map,root.left, i-1,a);
//    		levelorder(map,root.right,i-1,a);
//    	}
//	}  
//}
    
 
    
    
 
    
	// Root of Binary Tree
    Node root;
 
    // Constructors
    binary_tree() { root = null; }
    
    binary_tree(int data)
    {
        root = new Node(data);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	public static void main(String[] args) {
		binary_tree tree = new binary_tree();
		 
        /*create root*/
        tree.root = new Node(1);
 
        /* following is the tree after above statement
 
              1
            /   \
          null  null     */
 
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
 
        /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */
 
 
        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */


        tree.root.left.right = new Node(5);
        /* 5 becomes right child of 2
        			1
    			/       \
   			   2          3
 			 /   \       /  \
			4     5    null  null
		  /   \
		null null
         */
//        tree.root.right.left = new Node(6);
//        tree.root.left.right.right = new Node(7);
        

        
        
        
        
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//		postOrder(tree.root);
//		System.out.println();
//		inOrder(tree.root);
//		System.out.println();
//      System.out.println(height(tree.root));
//      System.out.println(size(tree.root));
//      maxmin(tree.root);System.out.println(min);System.out.println(max);
//
      int x=height(tree.root);
      for(int i=1;i<=x;i++) {
      	levelorder(tree.root, i);
      }
//
//        HashMap <Integer,Integer> map = new HashMap<>();
//        int x=height(tree.root);
//        for(int i=1;i<=x;i++) {
//        	int a=i;
//        	levelorder(map,tree.root, i,a);
//        }
//        System.out.println(map);
        
        
        
	} 
	
}

