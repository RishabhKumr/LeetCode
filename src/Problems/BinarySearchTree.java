package Problems;

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