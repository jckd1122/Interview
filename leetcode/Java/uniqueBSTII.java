import java.util.*;
public class Solution{
    public ArrayList<TreeNode> generateTrees(int n){
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        ArrayList<TreeNode> buf = new ArrayList<TreeNode>();
        generationHelper(list,1,n,0);
        return list;

    }

    public ArrayList<TreeNode> generationHelper(ArrayList<TreeNode> list,int start, int end,int depth){
        if(start > end)
            return null;

        TreeNode root = null;
        for(int i = start; i <= end;++i){
            root = new TreeNode(i);
            
            
                
            ArrayList<TreeNode> buf = generationHelper(list,start,i-1,depth+1);
            if(buf == null)
                root.left = null;
            else{
                for(TreeNode ele :buf)
                    root.left = ele;
            }
            
            buf = generationHelper(list,start,i-1,depth+1);
            if(buf == null)
                root.right = null;
            else{
                for(TreeNode ele :buf)
                    root.right = ele;
            }
            
            if(depth == 0)
                list.add(root);
            
            
            //if(root.left == null && root.right == null)
            //    list.add(root);
                
        }
        
        return list;
    }



}