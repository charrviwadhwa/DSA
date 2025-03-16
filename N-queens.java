class Solution {
    public static boolean issafeposition(List<String> arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (arr.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < arr.size(); i--, j++) {
            if (arr.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nqueens(List<String> board, int row, int n, List<List<String>> result) {
        if (row == n) {
            result.add(new ArrayList<>(board)); 
            return;
        }

        for (int col = 0; col < n; col++) {
            if (issafeposition(board, row, col)) {
                char[] newRow = board.get(row).toCharArray();
                newRow[col] = 'Q';
                board.set(row, new String(newRow));

                nqueens(board, row + 1, n, result);

                newRow[col] = '.';
                board.set(row, new String(newRow));
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> result = new ArrayList<>();
        List<String> board = new ArrayList<>(Collections.nCopies(n, ".".repeat(n)));
        nqueens(board, 0, n, result);
        return result;
    

    }
}
