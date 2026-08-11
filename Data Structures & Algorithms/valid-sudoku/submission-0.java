class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check rows, columns, and sub-boxes
        for (int i = 0; i < 9; i++) {
            if (!isRowClear(board[i]) || !isColumnClear(board, i)) {
                return false;
            }
        }

        // Check 3x3 sub-boxes
        for (int i = 0; i < 9; i++) {
            int rowStart = (i / 3) * 3;  // This gives us 0, 3, 6
            int colStart = (i % 3) * 3;  // This gives us 0, 3, 6
            if (!isSubBoxClear(board, rowStart, colStart)) {
                return false;
            }
        }

        return true;
    }

    // Check row for duplicates
    private boolean isRowClear(char[] row) {
        Map<Character, Boolean> rowMap = new HashMap<>();
        for (char cur : row) {
            if (cur != '.') {
                if (rowMap.containsKey(cur)) {
                    return false;
                }
                rowMap.put(cur, true);
            }
        }
        return true;
    }

    // Check column for duplicates
    private boolean isColumnClear(char[][] board, int colIndex) {
        Map<Character, Boolean> columnMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            char cur = board[i][colIndex];
            if (cur != '.') {
                if (columnMap.containsKey(cur)) {
                    return false;
                }
                columnMap.put(cur, true);
            }
        }
        return true;
    }

    // Check 3x3 sub-box for duplicates
    private boolean isSubBoxClear(char[][] board, int rowStart, int colStart) {
        Map<Character, Boolean> subBoxMap = new HashMap<>();
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                char cur = board[i][j];
                if (cur != '.') {
                    if (subBoxMap.containsKey(cur)) {
                        return false;
                    }
                    subBoxMap.put(cur, true);
                }
            }
        }
        return true;
    }
}
