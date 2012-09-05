public class Solution{
    public void recoverTree(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        inOrder(root,list);

        for(int i = 0; i < list.size();++i){


        }
        


    }

    void inOrder(TreeNode root, ArrayList<Integer> list){
        if(root.left != null)
            inOrder(root.left,list);
        list.add(root.val);
        if(root.right != null)
            inOrder(root.right);


    }

}
