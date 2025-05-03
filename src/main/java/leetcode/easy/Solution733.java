package leetcode.easy;

public class Solution733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // 시간복잡도 O(M * N)
        // 공간복잡도 O(M * N)
        // DFS 방식은 스택 오버플로우 위험이 있어 BFS 방식이 더 좋음

        // 첫번째 위치가 color와 같으면 무한순회에 빠짐
        int baseColor = image[sr][sc];
        if (baseColor == color) {
            return image;
        }

        dfs(image, sr, sc, baseColor, color);

        return image;
    }

    private void dfs(int[][] image, int row, int col, int baseColor, int color) {
        if (
            row < 0
                || row >= image.length
                || col < 0
                || col >= image[0].length
                || image[row][col] != baseColor
        ) {
            return;
        }

        image[row][col] = color;
        dfs(image, row + 1, col, baseColor, color);
        dfs(image, row - 1, col, baseColor, color);
        dfs(image, row, col + 1, baseColor, color);
        dfs(image, row, col - 1, baseColor, color);
    }
}
