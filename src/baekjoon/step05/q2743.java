package baekjoon.step05;

import java.io.*;

/**
 * @author : tildev
 * @date : 2023-05-01
 */
public class q2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s =  br.readLine();

        bw.write(String.valueOf(s.length()));
        
        bw.flush();
        bw.close();
    }
}
