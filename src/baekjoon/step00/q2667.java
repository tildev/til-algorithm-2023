package baekjoon.step00;

import java.io.*;

/**
 * 단지번호붙이기
 *
 * @author : tildev
 * @date : 2023-05-02
 */
public class q2667 {

    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static final int[] xArr = {0, 0, -1, 1};
    private static final int[] yArr = {-1, 1, 0, 0};

    private static int complexNum = 0;
    private static int[] complexCnt = new int[25 * 25];

    private static int[][] matrix = new int[25][25];
    private static boolean[][] visited = new boolean[25][25];

    public static void main(String[] args) throws Exception {

        int n = Integer.parseInt(br.readLine());

        initMatrix(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    complexNum += 1;
                    dFS(i, j, n);
                }
            }
        }



        bw.flush();
        bw.close();
    }

    /**
     * matrix DFS
     *
     * @param x
     * @param y
     */
    private static void dFS(int x, int y, int n) {
        if (visited[x][y]) {
            return;
        }

        complexCnt[complexNum]++;
        visited[x][y] = true;

        int impX;
        int impY;
        for (int i = 0; i < 4; i++) {
            impX = x + xArr[i];
            impY = y + yArr[i];

            if (impX >= 0 && impY >= 0 && impX < n && impY < n) {
                if (matrix[impX][impY] == 1 && (!visited[impX][impY])) {
                    dFS(impX, impY, n);
                }
            }
        }
    }

    /**
     * matrix 세팅
     *
     * @param n int
     * @return
     * @throws IOException
     */
    private static void initMatrix(int n) throws IOException {
        String s;
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.charAt(j) - '0';
            }
        }
    }
}
