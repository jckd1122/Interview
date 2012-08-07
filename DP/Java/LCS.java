import java.lang.math;

public class LCS{
    public int lcs(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] table = new int[m][n];

        if(m == 0 || n == 0)
            return 0;

        for(int i = 0; i < m;++i){
            if(s1.charAt(i) == s2.charAt(0)){
                for(int j = 0; j < m;++j{
                    table[0][j] = 1
                }
            }
        }

        for(int i = 0; i < n;++i){
            if(s2.charAt(i) == s1.charAt(0)){
                for(int j = 0; j < n;++j{
                    table[j][0] = 1
                }
            }
        }

        for(int i = 1;i < m;++i){
            for(int j = 1;j < n;++j){
                if(s1.charAt[i] == s2.charAt[j]{
                    table[i][j] = 1+table[i-1][j-1];
                }
                else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }

        }

        printSequence(table);
        return table[m-1][n-1];


    }
    
    public static void printSequence(int[][] table){
        int m = table.length();
        int n = table[0].length();
        
        int lValue = 0;
        int uValue = 0;
        while(m >= 0 && n >=0){
            lValue = table[m-1][n-2];
            uValue = table[m-2][n-1];
            if(table[m-1][n-1] >  Math.max(lValue,uValue)){
                m--;
                n--;
                System.out.print(table[m-1][n-1]+" ");
            }
            else if(lValue > uValue)
                n--;
            else
                m--;
        }
        

    }

    public static void main(String[] args){
        String s1 = "abcdgh";
        String s2 = "aedfhr";
        System.out.println(lcs(s1,s2));

    }




}
