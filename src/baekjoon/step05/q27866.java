package baekjoon.step05;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-05-01
 */
public class q27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s =  br.readLine();
        int n = Integer.parseInt(br.readLine());

        bw.write(s.charAt(n-1));

        bw.flush();
        bw.close();
    }
}
