//8.7

public class way_Of_Change{
    public static int getChange(int n){
        
        int count = 0;
        if(n >= 25)
            count += 1+getChange(n-25);
        else if(n >= 10)
            count += 1+getChange(n-10,);
        else if(n >= 5)
             count += 1+getChange(n-5);
        else if(n >= 1)
             count += 1+getChange(n-1);
        else
             return 0;
        return count;
            
    public static void main(String[] args){
        System.out.println(getChange(100));
    
    
    }
    
    }


}