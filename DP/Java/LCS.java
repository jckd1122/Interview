import java.lang.String;
import java.lang.Math;

/*pay attention to the indice, since it is accessing from i to i-1, it is recommended
  to add one more row and column to make it more clear
*/
public class LCS{
    public static int lcs2(String s1,String s2,int m,int n,int[][] table){
        if(m == 0 || n == 0)
            return 0;
        
        int result = 0;
        if(table[m][n] != -1)  return table[m][n];
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            result = 1+lcs2(s1,s2,m-1,n-1,table);
        }
        else{
            result = Math.max(lcs2(s1,s2,m-1,n,table),lcs2(s1,s2,m,n-1,table));
        }
        table[m][n] = result;
        return table[m][n];
        
    }

    public static int lcs1(String s1,String s2){
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
        int[][] table = new int[27][27];
        for(int i = 0; i < 27;++i){
            for(int j = 0; j < 27;++j){
                table[i][j] = -1;
            }
        }

        String s1 = "abcdefghijklmnzyxwvutsrqpo";
        String s2 = "opqrstuvwxyzabcdefghijklmn";
        System.out.println(lcs2(s1,s2,26,26,table));

    }




}
