package Problems;

//108. Convert Sorted Array to Binary Search Tree
//Given an integer array nums where the elements are sorted in
//ascending order, convert it to a height-balanced binary search tree.
//A height-balanced binary tree is a binary tree in which the depth 
//of the two subtrees of every node never differs by more than one

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
  }
 
class BinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)  return null;
        return BSTTree(nums,0,nums.length-1);
    }
    
    public TreeNode BSTTree(int[] nums,int left,int right)
    {
        if(left>right) return null;
        int midpoint = left + (right-left)/2;
        TreeNode node = new TreeNode(nums[midpoint]);
        node.left = BSTTree(nums,left,midpoint-1);
        node.right = BSTTree(nums,midpoint+1,right);
        return node;
    }
}