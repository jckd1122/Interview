//8.7

public class way_Of_Change{
    public static int getChange(int n,int denom){
        
        int count = 0;
        if(denom == 25){
            nextDenom = 10;
            break;
        }
        if(denom == 10){
            nextDenom = 5;
            break;
        }
        if(denom == 5){
            nextDenom = 1;
            break;
        }
        if(denom == 1){
            return 1;
        }
        
        for(int i = 0; i*denom <= n;++i){
            count += (n-i*denom,nextDenom);
        }
        return count;
        
    }
            
    public static void main(String[] args){
        System.out.println(getChange(100,25));
    
    
    }
    
    

}