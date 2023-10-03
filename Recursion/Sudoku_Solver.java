class Solution {

    public void solveSudoku(char[][] board) {
        
        helper(board, 0, 0);

    }

    public boolean helper(char[][] board, int i, int j) {

        if (i == board.length) return true;  // Successfully filled the board
        
        int ni, nj;

        if (j == board[0].length - 1) {

            ni = i + 1;
            nj = 0;

        } else {

            ni = i;
            nj = j + 1;

        }

        if (board[i][j] != '.') {

            return helper(board, ni, nj);  // Move to next cell if current is already filled
        } else {

            for (char a = '1'; a <= '9'; a++) {

                if (canPut(a, board, i, j)) {

                    board[i][j] = a;

                    if (helper(board, ni, nj)) return true;  // Recurse with the number placed, if solved, return true
                    board[i][j] = '.';  // Else, backtrack

                }
            }
        }
        return false;  // No valid number can be placed in this cell
    }

    public boolean canPut(char val, char[][] board, int row, int col) {

        for (int c = 0; c < board[0].length; c++) {
            if (board[row][c] == val) return false;
        }

        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == val) return false;
        }

        int si = 3 * (row / 3);
        int sj = 3 * (col / 3);

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[si + r][sj + c] == val) return false;
            }
        }
        
        return true;
    }
}
