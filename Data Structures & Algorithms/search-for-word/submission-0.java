class Solution {
    private int rows;
    private int columns;
    private Set<Pair<Integer, Integer>> path = new HashSet<>();

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        columns = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;  // Should be here
    }

    private boolean dfs(char[][] board, String word, int r, int c, int i) {
        if (i == word.length()) {
            return true;
        }
        if (validityConditions(board, word, r, c, i)) {
            return false;
        }

        path.add(new Pair<>(r, c));
        boolean res = dfs(board, word, r + 1, c, i + 1) ||
                      dfs(board, word, r - 1, c, i + 1) ||
                      dfs(board, word, r, c + 1, i + 1) ||
                      dfs(board, word, r, c - 1, i + 1);
        path.remove(new Pair<>(r, c));

        return res;  // Make sure to return the result of the recursive call
    }

    private boolean validityConditions(char[][] board, String word, int r, int c, int i) {
        return (r < 0 || c < 0 || r >= rows || c >= columns || board[r][c] != word.charAt(i) || path.contains(new Pair<>(r, c)));
    }
}
