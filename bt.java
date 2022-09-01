/*Diameter of Binary Tree 
Problem Statement
Given a Binary Tree, find diameter of it. The diameter of a tree is the number of nodes on the longest path between two leaves in the tree. The diagram below shows two trees each with diameter nine, the leaves that form the ends of a longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).
*/


/*
// Information about the class Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

*/
public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        int ansHeight=Math.max(leftHeight,rightHeight)+1;
        return ansHeight;
    }
public static int getDiameter(Node root) 
{
    // Your code here
    // you can create your own helper function   
            if(root==null){
            return 0;
        }
        int diam1=getDiameter(root.left);
        int diam2=getDiameter(root.right);
        int diam3=heightOfTree(root.left)+heightOfTree(root.right)+1;
        return Math.max(diam1,Math.max(diam2,diam3));
  
 }