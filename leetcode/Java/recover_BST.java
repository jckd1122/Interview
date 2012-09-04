public class Solution{
    public void recoverTree(TreeNode root){
        if(root == null)
            return;
        TreeNode l = root.left;
        TreeNode r = root.right;
        if(l != null && r != null){
            if(root.val > l.val){
                recoverTree(l);
            if(root.val < r.val)
                recoverTree(r);
            if(root.val < l.val)
                modify(root,l);
            else 
                modify(root,r);
                

        }
    }


    void modify(TreeNode root,Tree subRoot){
        if(root.val < subRoot.val){  //left
           TreeNode tmp = subRoot;
           while(tmp.left != null || tmp.right != null){
               
               if(root.val < tmp.right.val && root.val > tmp.left.val){
                    swap(tmp,root);
                }
               else if(root.val < tmp.left.val){
                    tmp = tmp.left;
               }
               else
                   tmp = tmp.right;
            }
            
        }

        if(

    }





}
