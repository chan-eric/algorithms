package algorithm;

import java.util.ArrayList;

public class NQueen {
    public ArrayList<ArrayList<String>> solveNQueens(int a) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        backtracking(new Board(a), ans);
        return ans;
    }


    public void backtracking(Board board, ArrayList<ArrayList<String>> ans) {
        if (board.isFull()) {
            ans.add(board.toStrings());
            return;
        }
        for (int i = 0; i < board.n; ++i) {
            if (board.placeable(i)) {
                board.place(i);
                backtracking(board, ans);
                board.remove();
            }
        }
    }

}

class Board {
    private boolean[] column;
    private boolean[] forward;
    private boolean[] backward;
    private int[] queens;
    private int row;
    public int n;

    public Board(int n) {
        this.n = n;
        row = 0;
        column = new boolean[n];
        forward = new boolean[2 * n];
        backward = new boolean[2 * n];
        queens = new int[n];
        
    }

    public boolean placeable(int col) {
        return !(column[col] || forward[col + row] || backward[col - row + n]);
    }
    
    public void place(int col) {
        column[col] = forward[col + row] = backward[col - row + n] = true;
        queens[row] = col;
        row++;
    }
    
    public void remove() {
        row--;
        int col = queens[row];
        column[col] = forward[col + row] = backward[col - row + n] = false;
    }

    public boolean isFull() {
        return row == n;
    }

    public ArrayList<String> toStrings() {
        ArrayList<String> ans = new ArrayList<>();
        for (int queen : queens) ans.add(rowAsString(queen));
        return ans;
    }

    public String rowAsString(int queen) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            if (i == queen) builder.append('Q');
            else builder.append('.');
        }
        return builder.toString();
    }

}

