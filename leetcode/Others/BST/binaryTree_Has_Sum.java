public class binaryTree_Has_Sum{
    public static boolean hasSum(Node root,int sum){
        if(root == null)
            return (sum == 0);
        
        if(root.left != null)
            return hasSum(root.left,sum-root.val);
        if(root.right != null)
            return hasSum(root.right,sum-root.val);
    }
    
    
    public static ArrayList<ArrayList<Integer>> printPath(Node root,int sum){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        
        printPath_Helper(root,sum,list,path);
        return list;
    }
    
    
    public static void printPath_Helper(Node root,int sum,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> path){
     
       
       if(root == null){
           if(sum == 0)
               list.add(new ArrayList<Integer>(path));
           return; 
       }
        
        if(root.left != null){
            path.add(root.val);
            printPath_Helper(root.left,sum-root.val,list,path);
        }
        path.remove(path.size()-1);
        if(root.right != null){
            path.add(root.val);
            printPath_Helper(root.right,sum-root.val,list,path);
        }
        
    }


}
