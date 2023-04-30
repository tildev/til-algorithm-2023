package baekjoon.step01;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 범위 문제 (int(x) long(o))
 *
 * @author : tildev
 * @date : 2023-04-30
 */
public class q11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");
        long result = 0;
        while (st.hasMoreTokens()) {
            result += Long.parseLong(st.nextToken());
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
