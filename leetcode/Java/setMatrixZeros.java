public class setMatrixZeros{
    public void setZeros(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m;++i){
            for(int j = 0; j < n;++j){
                if(matrix[i][j] != 0){
                    for(int k = 0; k < j;++k){
                        if(matrix[i][k] == 0)
                            matrix[i][j] = 0;
                    }
                    for(int k = 0; k < i;++k){
                        if(matrix[k][j] == 0)
                            matrix[i][j] = 0;
                    }

                }

            }

        }


    }




}
