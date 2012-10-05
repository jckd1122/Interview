
public class Solution {
    public boolean isBalanced(TreeNode root) {
        pair p = find_Min_Max(root);
        return p.max-p.min <= 1;
        
    }
    
    public pair find_Min_Max(TreeNode root){
        int min_Height = 10000;
        int max_Height = 0;
        int Height = 0;
        pair p = new pair(0,0);
        if(root == null)
            return p;
        Stack<TreeNode> s = new Stack<TreeNode>();
        root.val = 1;
        s.push(root);  
        
        while(!s.empty()){
            TreeNode node = s.pop();
            Height = node.val;
            if(Height > max_Height)
                max_Height = Height;
            if(Height < minHeight && (node.left == null || node.right == null))
                min_Height = Height;
           
            if(node.right != null){
                node.right.val = Height+1;
                s.push(node.right);
            }
            if(node.left != null){
                node.left.val = Height+1;
                s.push(node.left);
                
            }
        }
        p.min = min_Height;
        p.max = max_Height;
        return p;
        
    
    }
    
    class pair{
        int min;
        int max;
        
        pair(int min, int max){
            this.min = min;
            this.max = max;
        }
    }
}