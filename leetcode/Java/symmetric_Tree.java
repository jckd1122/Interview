public class Solution {
    //iterative
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root.left == null && root.right == null)
            return true;
        if((root.left == null)^(root.right == null))
            return false;
        queue.offer(root.left);
        queue.offer(root.right);
        
        while(!queue.isEmpty()){
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if(node1.val != node2.val)
                return false;
       
            if(node1.left != null && node2.right != null){
                queue.offer(node1.left);
                queue.offer(node2.right);
            }
            if((node1.left == null)^(node2.right == null))
                return false;
            
            
            if(node1.right != null && node2.left != null){
                queue.offer(node1.right);
                queue.offer(node2.left);
            }
            if((node1.right == null)^(node2.left == null))
                return false;
 
        }
        return true;
    }

    //recursion
        if(root == null)
            return true;
         return helper(root.left,root.right);
         
    }
    
    public boolean helper(TreeNode Node1,TreeNode Node2){
         if((Node1 == null)^(Node2 == null))
            return false;
         
         if(Node1 != null && Node2 != null){
             return (Node1.val == Node2.val) && helper(Node1.left,Node2.right) && helper(Node1.right,Node2.left);
             
         }
         return true;
        
    }



}