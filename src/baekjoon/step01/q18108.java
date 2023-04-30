package baekjoon.step01;

import java.io.*;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(input - 543));
        bw.flush();
        bw.close();
    }
}
