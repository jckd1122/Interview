import java.util.*;
public class Solution{
    public ArrayList<TreeNode> generateTrees(int n){
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        ArrayList<TreeNode> buf = new ArrayList<TreeNode>();
        return generationHelper(1,n,0);
        

    }

    public ArrayList<TreeNode> generationHelper(int start, int end,int depth){
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        if(end == 0){
            list.add(null);
            return list;
        }
        if(start > end)
            return null;

        TreeNode root = null;
        for(int i = start; i <= end;++i){
            root = new TreeNode(i);
            
            
                
            ArrayList<TreeNode> buf1 = generationHelper(start,i-1,depth+1);
            ArrayList<TreeNode> buf2 = generationHelper(i+1,end,depth+1);
            if(buf1 == null && buf2 == null){
                root.left = null;
                root.right = null;
                list.add(root);
            }
            else{
                
                if(buf1 != null){
                    for(TreeNode ele1 :buf1){
                        TreeNode node = new TreeNode(i);
                        node.left = ele1;
                        if(buf2 != null){
                            for(TreeNode ele2 :buf2){
                                node.right = ele2;
                                list.add(node);
                            }
                        }
                    }
                }
               
                
            }
        }
        
        return list;
    }



}