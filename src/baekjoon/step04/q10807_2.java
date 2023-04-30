package baekjoon.step04;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q10807_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < n; i++) {
            int nv = Integer.parseInt(st.nextToken());
            if (v == nv) {
                result += 1;
            }
        }
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}
