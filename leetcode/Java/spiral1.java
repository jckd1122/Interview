import java.util.*;
import java.util.*;
public class Solution{
    public ArrayList<Integer> spiralOrder(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix.length == 0)
            return list;
            
        int m = matrix.length;
        int n = matrix[0].length;
        if(n == 1 && m > 1){
            for(int i = 0; i < m;++i)
                list.add(matrix[i][0]);
            return list;
        }
        if(m == 1 && n > 1){
            for(int j = 0; j < n;++j)
                list.add(matrix[0][j]);
            return list;
        }

        if(m == 1 && n == 1){
            list.add(matrix[0][0]);
            return list;
        }

        
        int rowStart = 0;
        int colStart = 0;
         while(true){
            
            
            
            if(rowStart >= m-1 && colStart < n-1){
                for(int j = colStart; j < n;++j)
                    list.add(matrix[rowStart][j]);
            }
            if(colStart >= n-1 && rowStart < m-1){
                for(int i = rowStart; i < m;++i)
                    list.add(matrix[i][colStart]);
                break;
            }
            if(colStart == n-1 && rowStart == m-1)
                break;
            
            
            for(int j = colStart ; j < n;++j)
                list.add(matrix[rowStart][j]);
            for(int i = rowStart+1; i < m;++i)
                list.add(matrix[i][colStart+n-1]);
            for(int j = colStart+n-2 ; j >= colStart;--j)
                list.add(matrix[rowStart+m-1][j]);
            for(int i = rowStart+m-2; i >= rowStart+1;--i)
                list.add(matrix[i][colStart]);
           
            rowStart++;
            colStart++;           
            m--;
            n--;
            

        }
        return list;
        
    }


}