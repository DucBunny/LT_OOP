import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Maze {
    static class Point {
        int x, y, steps;

        Point(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }

    public static int shortest(int[][] maze, int n, int m, int r, int c) {
        // Kiểm tra nếu ô bắt đầu không hợp lệ
        if (maze[r][c] == 1)
            return -1;

        // Các hướng di chuyển: lên, xuống, trái, phải
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        // Hàng đợi BFS
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        // Đánh dấu ô bắt đầu và thêm vào hàng đợi
        queue.add(new Point(r, c, 0));
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll(); // Lấy ô hiện tại ra khỏi hàng đợi

            // Nếu ô hiện tại nằm trên biên, ta đã thoát khỏi mê cung
            if (current.x == 0 || current.x == n - 1 || current.y == 0 || current.y == m - 1)
                return current.steps + 1;

            // Duyệt các ô lân cận
            for (int i = 0; i < 4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                // Kiểm tra tính hợp lệ của ô lân cận
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && maze[nextX][nextY] == 0
                        && !visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    queue.add(new Point(nextX, nextY, current.steps + 1));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int r = Integer.parseInt(input[2]);
            int c = Integer.parseInt(input[3]);

            int[][] maze = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] row = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    maze[i][j] = Integer.parseInt(row[j]);
                }
            }

            System.out.println(shortest(maze, n, m, r - 1, c - 1));
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}
