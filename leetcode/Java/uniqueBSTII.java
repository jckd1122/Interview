import java.util.*;
public class Solution{
    public ArrayList<TreeNode> generateTrees(int n){
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        return generationHelper(list,1,n,0);
       

    }

    public ArrayList<TreeNode> generationHelper(ArrayList<TreeNode> list,int start, int end,int depth){
        if(start > end)
            return null;

        TreeNode root = null;
        for(int i = start; i <= end;++i){
            root = new TreeNode(i);
            if(generationHelper(list,start, i-1,depth+1) == null)
                root.left = null;
            if(generationHelper(list,i+1, end,depth+1) == null)
                root.right = null;
            for(TreeNode ele :generationHelper(list,start, i-1,depth+1))
                    root.left = ele;
            for(TreeNode ele :generationHelper(list,i+1, end,depth+1))
                root.right = ele;
            list.add(root);    
            //if(root.left == null && root.right == null)
            //    list.add(root);
                
        
        }
        
        return list;
    }



}