import java.util.*;

public class binaryTree_Has_Sum{
    public static boolean hasSum(Node root,int sum){
        if(root.left == null && root.right == null)
            return root.val == sum;
        
        
        if(root.left != null)
            return hasSum(root.left,sum-root.val);
        if(root.right != null)
            return hasSum(root.right,sum-root.val);
        
        return hasSum(root.left,sum-root.val) || hasSum(root.right,sum-root.val);

        
    }
    
    
    public static ArrayList<ArrayList<Integer>> printPath(Node root,int sum){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        
        printPath_Helper(root,sum,list,path);
        return list;
    }
    
    
    public static void printPath_Helper(Node root,int sum,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> path){
     
       
       if(root.left  == null && root.right == null){
           if(sum == root.val){
               path.add(root.val);
               list.add(new ArrayList<Integer>(path));
           }
           return; 
       }
        
        
        path.add(root.val);
        if(root.left != null)
            printPath_Helper(root.left,sum-root.val,list,path);
        
        if(root.right != null)
            printPath_Helper(root.right,sum-root.val,list,path);
        
        path.remove(path.size()-1);

        
        
    }

    public static void main(String[] args){
       int[] arr = {2,3,4};
       Node root = Node.arrayToBST(arr,0,2);
       Node tree = new Node(1);
       tree.right = new Node(2);

       //System.out.println(hasSum(tree,3));
       ArrayList<ArrayList<Integer>> list = printPath(root,7);
       for(ArrayList<Integer> ele : list){
           for(int num:ele)
               System.out.print(num+" ");
           System.out.println();
       }


    }


}
