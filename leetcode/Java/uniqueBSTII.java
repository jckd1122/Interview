import java.util.*;
public class Solution{
    public ArrayList<TreeNode> generateTress(int n){
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        generationHelper(list,1,n,n);
        return list;

    }

    public TreeNode generationHelper(ArrayList<TreeNode> list,int start, int end,int n){
        if(start > end)
            return null;

        for(int i = start; i <= end;++i){
            TreeNode root = new TreeNode(i);
            root.left = generationHelper(list,1, i-1,n);
            root.right = generationHelper(list,i+1,end,n);
            if(root.left == null && root.right == null && start == 1 && end == n)
                list.add(root);
                
        
        }
        return null;
    }



}