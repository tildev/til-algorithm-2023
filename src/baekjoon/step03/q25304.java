package baekjoon.step03;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        while (count-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            total -= (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }

        if (total == 0) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
    }
}
