
public class editDist{

    public int dist(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dist = new int[m+1][n+1];
        for(int i = 0; i < m+1;++i)
            dist[i][0] = 0;
        for(int j = 0; j < n+1;++j){
            dist[0][j] = 0;
        
        int repl = 0;
        for(int i = 1; i < m+1;++i){
            for(int j = 1; j < n+1;++j){
                repl = (dist[i] == dist[j])? 0:1;
                dist[i][j] = min(dist[i-1][j]+1,dist[i][j-1]+1,dist[i][j]+repl);

            }

        }
        return dist[m][n];


    }

    public int min(int a,int b ,int c){
        if(a >= b){
            if(b >= c)
                return c;
            else
                return b;
        }
        else if(a >= c)
            return c;
        else
            return a;
    }

}
