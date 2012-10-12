//8.7

public class num_Of_Change{
    public static int getChange(int n,int denom){
        
        int count = 0;
        int nextDenom = 0;
        if(denom == 25){
            nextDenom = 10;
        }
        if(denom == 10){
            nextDenom = 5;
        }
        if(denom == 5){
            nextDenom = 1;
        }
        if(denom == 1){
            return 1;
        }
        
        for(int i = 0; i*denom <= n;++i){
            count += getChange(n-i*denom,nextDenom);
        }
        return count;
        
    }


    public static int getChange1(int n,int kind){
        if(n == 0)
            return 1;
        if(n < 0 || kind == 0)
            return 0;

        return getChange1(n-getValue(kind),kind)+getChange1(n,kind-1);


    }

    public static int getValue(int kind){
        if(kind == 4) return 25;
        if(kind == 3) return 10;
        if(kind == 2) return 5;
        if(kind == 1) return 1;
        return 0;
    }
            
    public static void main(String[] args){
        System.out.println(getChange1(100,4));
    
    
    }
    
    

}
