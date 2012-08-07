import java.lang.String;
import java.lang.Math;

public class LCS{
    public static int lcs(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] table = new int[m][n];

        if(m == 0 || n == 0)
            return 0;

        for(int i = 0; i < m;++i){
            if(s1.charAt(i) == s2.charAt(0)){
                for(int j = 0; j < m;++j){
                    table[0][j] = 1;
                }
            }
        }

        for(int i = 0; i < n;++i){
            if(s2.charAt(i) == s1.charAt(0)){
                for(int j = 0; j < n;++j){
                    table[j][0] = 1;
                }
            }
        }

        for(int i = 1;i < m;++i){
            for(int j = 1;j < n;++j){
                if(s1.charAt(i) == s2.charAt(j)){
                    table[i][j] = 1+table[i-1][j-1];
                }
                else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }

        }

        printSequence(s1,s2,table);
        return table[m-1][n-1];


    }
    
    public static void printSequence(String s1,String s2,int[][] table){
        int m = table.length;
        int n = table[0].length;
        
        int lValue = 0;
        int uValue = 0;
        while(true){
            if(m == 1 || n == 1)
                break;
            lValue = table[m-1][n-2];
            uValue = table[m-2][n-1];
            if(table[m-1][n-1] >  Math.max(lValue,uValue)){
                m--;
                n--;
                System.out.print(s1.charAt(m-1)+" ");
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
