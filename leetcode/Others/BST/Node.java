//package BST;



public class Node {
	
	public	int val;
	public	Node left = null;
	public  Node right = null;
		
	public Node(int val){
			this.val = val;
	}
	
	public int getVal(){
		return this.val;
	}
	
	public Node getLeft(){
		return this.left;
	}
	
	public Node getRight(){
		return this.right;
	}
	
	public void addLeft(Node node){
		this.left = node;
	}
	
	public void addRight(Node node){
		this.right = node;
	}

    public static Node arrayToBST(int arr[], int start, int end) {
        if (start > end) return null;
        // same as (start+end)/2, avoids overflow.
        int mid = start + (end - start) / 2;
        Node node = new Node(arr[mid]);
        node.left = arrayToBST(arr, start, mid-1);
        node.right = arrayToBST(arr, mid+1, end);
        return node;
    }
	
}

