import java.util.*;
public class Solution{
    public ArrayList<TreeNode> generateTrees(int n){
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        generationHelper(list,1,n,0);
        return list;

    }

    public TreeNode generationHelper(ArrayList<TreeNode> list,int start, int end,int depth){
        if(start > end)
            return null;

        TreeNode root = null;
        for(int i = start; i <= end;++i){
            root = new TreeNode(i);
            root.left = generationHelper(list,start, i-1,depth+1);
            root.right = generationHelper(list,i+1,end,depth+1);
            if(depth == 0)
                list.add(root);
            //if(root.left == null && root.right == null)
            //    list.add(root);
                
        
        }
        return root;
    }



}