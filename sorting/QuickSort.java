public class QuickSort{
    public static void sort(int[] arr, int start, int end){
        if(start < end){
            int p = partition(arr, start,end);
            sort(arr,start,p-1);
            sort(arr,p+1,end);
        }
    }

    public static int partition1(int[] arr, int start, int end){
        int pivot = arr[start];
        int i = start+1;
        int j = start+1;
        while(j <= end){
            if(arr[j] < pivot){
                swap(arr,i,j);
                i++;
            }
            j++;
        }
        swap(arr,start,i-1);
        return i-1;

    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        sort(arr,0,4);
        for(int i = 0; i < arr.length;i++)
            System.out.println(arr[i]);

    }








}







