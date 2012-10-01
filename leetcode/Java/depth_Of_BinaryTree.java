public class Solution{
    public int maxHeight(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(1+maxHeight(root.left),1+maxHeight(root.right));
    }
    
    //using preOrder Traversal
    public int maxHeight(TreeNode root){
        if(root == null)
            return 0;
        Stack<TreeNode> s = new Stack<TreeNode>();
        root.val = 1;
        s.push(root);
        int height = 0;
        int maxHeight = 0;
        while(!s.empty()){
            TreeNode node = s.pop();
            height = node.val;
            if(maxHeight < height)
                maxHeight = height;
            if(node.right != null){
                node.right.val = height+1;
                s.push(node.right);
            }
            if(node.left != null){
                node.left.val = height+1;
                s.push(node.left);
            }
        }
        return maxHeight;
    }

    //using postOrder Traversal

}
