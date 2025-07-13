import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean res=true;
        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] cols=new HashSet[9];
        HashSet<Character>[][] grid=new HashSet[3][3];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j]=new HashSet<>();
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(rows[i].contains(board[i][j])||cols[j].contains(board[i][j])||grid[i/3][j/3].contains(board[i][j])){
                    return false;
                }
                cols[j].add(board[i][j]);
                rows[i].add(board[i][j]);
                grid[i/3][j/3].add(board[i][j]);
            }
        }
        return res;
    }
}