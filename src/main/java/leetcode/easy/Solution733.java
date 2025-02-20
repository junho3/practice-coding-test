package leetcode.easy;

public class Solution733 {

    private static final int[][] DIRECTIONS = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    private Integer target;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // 첫번째 위치가 color와 같으면 무한순회에 빠짐
        if (image[sr][sc] == color) {
            return image;
        }

        target = image[sr][sc];
        dfs(image, sr, sc, color);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int color) {
        if (image[row][col] != target) {
            return;
        }

        image[row][col] = color;

        for (int[] direction : DIRECTIONS) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (
                newRow >= 0
                && newRow < image.length
                && newCol >= 0
                && newCol < image[0].length
            ) {
                dfs(image, newRow, newCol, color);
            }
        }
    }
}
