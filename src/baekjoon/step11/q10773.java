package baekjoon.step11;

import java.io.*;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * 스택
 *
 * @author : tildev
 * @date : 2023-05-01
 */
public class q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        while (k-- > 0) {
            int value = Integer.parseInt(br.readLine());
            if (value == 0 && !stack.empty()) {
                stack.pop();
            } else {
                stack.add(value);
            }
        }

        bw.write(String.valueOf(stack.stream().mapToInt(Integer::intValue).sum()));

        bw.flush();
        bw.close();
    }
}
