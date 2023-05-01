package baekjoon.step05;

import java.io.*;

/**
 * @author : tildev
 * @date : 2023-05-01
 */
public class q9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        while (num-- > 0) {
            String s = br.readLine();
            bw.write((s.charAt(0) + "" + s.charAt(s.length() - 1)));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
