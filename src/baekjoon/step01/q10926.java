package baekjoon.step01;

import java.io.*;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        bw.write(input);
        bw.write("??!");
        bw.flush();
        bw.close();
    }
}
