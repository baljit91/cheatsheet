1. validate BST.


Technique        
1.set the range for every node value of tree.
  if(root == null) return true;
    for root node the range will be integer min and integr max.
   and for left subtree the tree the range will be current min val and current root.val
   and for right subtree the range will be current root.val and current max.
   
   and go on


    public boolean isValidBSTUtil(TreeNode root,long min, long max) {
        if(root == null)
            return true;
            
        return (root.val < max && root.val > min) && isValidBSTUtil(root.left,min,root.val) && isValidBSTUtil(root.right,root.val,max);
    }

Time Complexity:
O(n).
Space Complexity:
O(1).
