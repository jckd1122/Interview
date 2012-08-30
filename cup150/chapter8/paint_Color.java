public class paint_Color{
    enum color = {black,white,green,red};

    public static void paint(color[][] board,int x,int y,color newColor,oldColor){
        int m = board.length;
        int n = board[0].length;

        if(x == m || x == -1 || y == n || y == -1)
            return;

        if(board[x][y] == oldColor){
            board[x][y] = newColor;
            paint(board,x+1,y,newColor,oldColor);
            paint(board,x-1,y,newColor,oldColor);
            paint(board,x,y+1,newColor,oldColor);
            paint(board,x,y-1,newColor,oldColor);
        }
        return;
    }

}
