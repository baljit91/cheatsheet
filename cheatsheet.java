1..//Tree height

    public int height(TreeNode root){
        if(root == null)
            return 0;
            
        return Math.max(height(root.left),height(root.right)) + 1;
    }
----------------------------------------------------------------------
2..//linked list middle

while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }

-----------------------------------------------------------------------
    
    
    
    3..//Use sorted TreeMap:

Map<String, Float> map = new TreeMap<String, Float>(yourMap);
  
---------------------------------------------------------------------------
   4.. //iterate through map
    for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
}
    
 ---------------------------------------------------------------------  
     
     
     nodes.addAll(Arrays.asList(data.split(spliter)));

------------------------------------
