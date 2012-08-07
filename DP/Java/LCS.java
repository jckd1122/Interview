import java.lang.String;
import java.lang.Math;

public class LCS{
    public static int lcs(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] table = new int[m+1][n+1];

        if(m == 0 || n == 0)
            return 0;

        for(int i = 0; i < m+1;++i){
            table[i][0] = 0;
        }

        for(int j = 0; j < n;++j){
            table[0][j] = 0;
        }

        for(int i = 1;i < m+1;++i){
            for(int j = 1;j < n+1;++j){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    table[i][j] = 1+table[i-1][j-1];
                }
                else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }

        }

        printSequence(s1,s2,table);
        return table[m][n];


    }
    
    public static void printSequence(String s1,String s2,int[][] table){
        int m = table.length-1;
        int n = table[0].length-1;
        
        int lValue = 0;
        int uValue = 0;
        while(true){
            if(m == 0 || n == 0)
                break;
            lValue = table[m][n-1];
            uValue = table[m-1][n];
            if(table[m][n] >  Math.max(lValue,uValue)){
                System.out.print(s1.charAt(m-1)+" ");
                m--;
                n--;
            }
            else if(lValue > uValue)
                n--;
            else
                m--;
        }
        

    }

    public static void main(String[] args){
        String s1 = "abcdefghijklmnzyxwvutsrqpo";
        String s2 = "opqrstuvwxyzabcdefghijklmn";
        System.out.println(lcs(s1,s2));

    }




}
