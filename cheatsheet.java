//Tree height

    public int height(TreeNode root){
        if(root == null)
            return 0;
            
        return Math.max(height(root.left),height(root.right)) + 1;
    }
----------------------------------------------------------------------
//linked list middle

while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }

-----------------------------------------------------------------------
    
    
    
