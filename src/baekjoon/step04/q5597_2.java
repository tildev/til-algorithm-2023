package baekjoon.step04;

import java.io.*;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q5597_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] isNum = new boolean[31];

        for (int i = 0; i < 28; i++) {
            isNum[Integer.parseInt(br.readLine())] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!isNum[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
