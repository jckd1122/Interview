public class Solution{
    public int trap(int[] A){
        int l = A.length;
        int sum = 0;
        int i = 0;
        int left = 0;
        int right = 0;
        int prev = 0;
        boolean isLeft = false;
        boolean isRight = false;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while(i < l){
            //determine decrease
            while(i < l && A[i] <= prev ){
                list1.add(i);
                prev = A[i];
                i++;
            }
            
            while(i < l && A[i] >= prev ){
                list2.add(i);
                prev = A[i];
                i++;
            }
            
            if((i < l && A[i] < prev) || (i == l)){
                right = i-1;
                sum += cal(list1,list2,left,right,A);
                left = i-1;
            }

            //determine increase

        }
        return sum;


    }


    int cal(ArrayList<Integer> list1,ArrayList<Integer> list2,int left,int right,int[] A){
        if(left == right)
            return 0;
        int sum = 0;
        int height = (A[left] < A[right])? A[left]:A[right];
        if(A[left] < A[right]){
            for(int ele : list2){
                if(A[ele] >= A[left] ){
                    right = ele;
                    break;
                }
            }
        }
        else{
            for(int ele : list1){
                if(A[ele] <= A[right] ){
                    left = ele-1;
                    break;
                }
            }
        }
        //int height = (A[left] < A[right])? A[left]:A[right];
        sum +=(right-left-1)*height;
        if(A[left] < A[right]){
            for(int i = 0; i < list1.size();++i)
                sum -= A[list1.get(i)];
            for(int i = 0; i < list2.size();++i)
                if(list2.get(i) <= right-1)
                    sum -= A[list2.get(i)];
        }
        else{
            for(int i = 0; i < list1.size();++i)
                if(list1.get(i) >= left+1)
                sum -= A[list1.get(i)];
            for(int i = 0; i < list2.size();++i)
                sum -= A[list2.get(i)];
        }
        list1.clear();
        list2.clear();
        return sum;



    }

}