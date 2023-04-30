package baekjoon.step04;

import java.io.*;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] sNum = new int[30];

        for (int i = 0; i < 28; i++) {
            sNum[Integer.parseInt(br.readLine()) - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (sNum[i] == 0) {
                bw.write(String.valueOf(i + 1));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
