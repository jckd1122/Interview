public class rotateArray{
    public static void rotate(int[] arr, int n, int k){
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,3);
    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        rotate(arr,4,2);
        for(int i = 0; i < 4;++i)
            System.out.println(arr[i]);

    }





}
