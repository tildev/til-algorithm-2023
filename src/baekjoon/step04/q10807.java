package baekjoon.step04;

import javax.management.StringValueExp;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author : tildev
 * @date : 2023-04-30
 */
public class q10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int nv = Integer.parseInt(st.nextToken());
            map.put(nv, map.getOrDefault(nv, 0) + 1);
        }
        int v = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(map.getOrDefault(v, 0)));

        bw.flush();
        bw.close();
    }
}
