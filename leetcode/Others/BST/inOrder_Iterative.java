//package BST;
import java.util.*;

public class inOrder_Iterative{
    public static void print1(Node root){
        Stack<Node> s = new Stack<Node>();
        if(root == null)
            return;
        Node cur = root;
        while(cur != null){
            s.push(cur);
            cur = cur.left;
        }

        while(!s.empty()){
            cur = s.pop();
            System.out.println(cur.val);
            if(cur.right != null){
                s.push(cur.right);
                cur = s.peek(); 
                while(cur.left != null){
                    s.push(cur.left);
                    cur = cur.left;
                }
            }
        }
    }
    public static void print2(Node root){
        Stack<Node> s = new Stack<Node>();
        if(root == null)
            return;
        Node cur = root;
        while(!s.empty() || cur != null){
            if(cur != null){
                s.push(cur);
                cur = cur.left;
            }
            else{
                cur = s.pop();
                System.out.println(cur.val);
                cur = cur.right; 
            }    
        }
    }

    public static void print_Level(Node root){
        if(root == null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println(node.val);
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);

        }
    }

    public static Node arrToBST(int[] arr, int lo, int hi){
        if(lo > hi)
            return null;
        int mid = lo+(hi-lo)/2;
        Node root = new Node(arr[mid]);
        root.left = arrToBST(arr,lo,mid-1);
        root.right = arrToBST(arr,mid+1,hi);
        return root;


    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //Node root = Node.arrayToBST(arr,0,9);
        //print1(root);
        Node root = arrToBST(arr,0,9);
        //print1(root);
        print_Level(root);
    }






}
