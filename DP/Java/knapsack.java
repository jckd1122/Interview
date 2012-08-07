import java.lang.Math;
import java.lang.String;

public class knapsack{
    //create a 2D array, for convience , use index that is greate than 0;
    public static int solve(int[][] f,int n,int w){
        if(n == 0)
            return 0;
        if(f[2][n] > w)
            return solve(f,n-1,w);
        else
            return Math.max(f[1][n]+solve(f,n-1,w-f[2][n]),solve(f,n-1,w));
    }

    public static int solveDP(int[][] f,int[][] table,int n,int w){
        int result = 0;
        if(n == 0)
            return 0;
        if(table[n][w] != 0) return table[n][w];
        if(f[2][n] > w)
            result = solve(f,n-1,w);
        else{
            if(f[1][n]+solveDP(f,table,n-1,w-f[2][n]) > solveDP(f,table,n-1,w)){
                //System.out.print(f[1][n]+" "); can't print here since recursion will generate unsed solution which is not global optimal
                result = f[1][n]+solveDP(f,table,n-1,w-f[2][n]);
            }
            else
                result = solveDP(f,table,n-1,w);
        }
        table[n][w] = result;
        return result;
    }


    static void printSeq(int[][] f,int[][] table,int n, int w){

        while(n > 0){
            if(table[n][w] == table[n-1][w]){
                n--;
            }
            else{
                System.out.println(f[1][n]+" ");
                w = w-f[2][n];
                n--;
            }
        }
    }

    public static void main(String[] args){
        int[][] table = new int[8][16];
        int[][] f = {{0,0,0,0,0,0,0,0},{0,7,9,5,12,14,6,12}, {0,3,4,2,6,7,3,5}};
        System.out.println(solveDP(f,table,7,15));
        printSeq(f,table,7,15);

    }


}
