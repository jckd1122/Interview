import java.util.*;

public class binaryTree_Has_Sum{
    public static boolean hasSum(Node root,int sum){
        if(root == null)
            return (sum == 0);
        
        
        return hasSum(root.left,sum-root.val) || hasSum(root.right,sum-root.val);
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
        
        
        path.add(root.val);
        printPath_Helper(root.left,sum-root.val,list,path);
        path.remove(path.size()-1);
        
        
        
        path.add(root.val);
        printPath_Helper(root.right,sum-root.val,list,path);
        
        
    }

    public static void main(String[] args){
       int[] arr = {1,2,3,4,5,6,7,8,9};
       Node root = Node.arrayToBST(arr,0,8);
       System.out.println(hasSum(root,14));
       ArrayList<ArrayList<Integer>> list = printPath(root,14);
       for(ArrayList<Integer> ele : list){
           for(int num:ele)
               System.out.print(num+" ");
           System.out.println();

       }

    }


}
