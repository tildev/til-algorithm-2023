package baekjoon.step06;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-05-01
 */
public class q3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chessPieceArr = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < chessPieceArr.length; i++) {
            chessPieceArr[i] -= Integer.parseInt(st.nextToken());
            bw.write(chessPieceArr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
