public class Solution{
    public int maxHeight(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(1+maxHeight(root.left),1+maxHeight(root.right));
    }


}
