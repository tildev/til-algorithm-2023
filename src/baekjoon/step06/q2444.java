package baekjoon.step06;

import java.io.*;

/**
 * @author : tildev
 * @date : 2023-05-01
 */
public class q2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < ((n - 1 - i) * 2) - 1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
