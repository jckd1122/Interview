


public class canJump2{

    public static int minJump(int[] A){
        int length = A.length;
        int[] table = new int[length-1];
        //table[length-2] = (A[length-2] > 0)? 1:0;
        for(int i = length-2; i >= 0; --i){
            if(A[i] == 0)
                table[i] = 0;
            else if(A[i]+i >= length-1)
                table[i] = 1;
            else{
                int jump = 100;
                for(int j = i+1; j <= A[i]+i;++j){
                    if(jump >= 1+table[j])
                        jump = 1+table[j];
                }
                table[i] = jump;
            }
        }
        return table[0];
    }

    public static void main(String[] args){
        int[] A = {9,8,2,2,0,2,2,0,4,1,5,7,9,6,6,0,6,5,0,5};
        System.out.println(minJump(A));


    }

}
