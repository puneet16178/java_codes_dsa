package dsa;

import java.util.*;

public class Binarytree {
	
	static class Node{
		int data;Node left, right;
		public 
		Node(int data) {
			this.data=data;
			left=right=null;
		}
	}
	
	//static class createbtree{
		static int idx=-1;
		public static Node createtree(int arr[]) {
			idx++;
			if(arr[idx]==-1) return null;
			Node root = new Node(arr[idx]);
			root.left=createtree(arr);
			root.right=createtree(arr);
			return root;
		}
	//}
	
	static void preorder(Node root) {
		if(root==null) return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	static void postorder(Node root) {
		if(root==null) return;	
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	static void inorder(Node root) {
		if(root==null) return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	static void levelorder(Node root) {
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node node =q.remove();
			System.out.print(node.data+" ");
			if(node.left!=null)q.add(node.left);
			if(node.right!=null)q.add(node.right);
		}
	}
	
	static int val=0;
	static int totnodes(Node root) {
		if(root==null)return 0;
		val++;
		totnodes(root.left);
		totnodes(root.right);
		return val;
	}
	
	static int sumnode=0;
	static int sumnodes(Node root) {
		if(root==null)return 0;
		sumnode=sumnode+root.data;
		sumnodes(root.left);
		sumnodes(root.right);
		return sumnode;
	}
	
	static int heightoftree(Node root) {
		if(root==null) return 0;
		int leftheight=heightoftree(root.left);
		int rightheight=heightoftree(root.right);
		int treeheight=Math.max(leftheight, rightheight)+1;
		return treeheight;
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,8,-1,-1,-1,5,9,-1,-1,-1,3,6,-1,10,-1,-1,7,-1,-1};
		
		//createbtree tree=new createbtree();
		Node root=createtree(arr);
		
		System.out.print("preorder:");
		preorder(root);
		System.out.println();
		System.out.print("postorder:");
		postorder(root);
		System.out.println();
		System.out.print("inorder:");
		inorder(root);
		System.out.println();
		System.out.print("levelorder:");
		levelorder(root);
		System.out.println();
		System.out.print("total nodes:");
		System.out.print(totnodes(root));
		System.out.println();
		System.out.print("sum of nodes:");
		System.out.print(sumnodes(root));
		System.out.println();
		System.out.print("height of tree:");
		System.out.print(heightoftree(root));
		
	}

}
