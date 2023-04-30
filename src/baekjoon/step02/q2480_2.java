package baekjoon.step02;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q2480_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        int result;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a != b && a != c && b != c) {
            result = Math.max(a, Math.max(b, c)) * 100;
        } else if (a == b && b == c) {
            result = 10000 + a * 1000;
        } else {
            if (b == c) {
                result = 1000 + b * 100;
            } else {
                result = 1000 + a * 100;
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}
