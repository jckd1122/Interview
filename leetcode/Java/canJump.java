import java.util.BitSet; 
public class canJump(){

    public boolean can(int[] A){
        BitSet bits = new BitSet(A.length-1);
        for(int i = 0; i < A.length-1;++i){
            if(A[i] >= length-1-i)
                bits.set(i);
        }
        return bits == true;

    }





}
