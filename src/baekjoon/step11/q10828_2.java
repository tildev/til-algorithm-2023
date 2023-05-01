package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 스택
 *
 * @author : tildev
 * @date : 2023-05-01
 */
public class q10828_2 {
    static List<Integer> stack = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();
    private static int size = 0;
    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String TOP = "top";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case PUSH:
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case POP:
                    pop();
                    break;
                case SIZE:
                    size();
                    break;
                case EMPTY:
                    empty();
                    break;
                case TOP:
                    top();
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb.toString());
    }

    private static void push(int num) {
        stack.add(num);
        size++;
    }

    private static void pop() {
        if (size == 0) {
            sb.append("-1");
        } else {

            sb.append(stack.remove(size - 1));
            size--;
        }
        sb.append("\n");
    }

    private static void size() {
        sb.append(size).append("\n");
    }

    private static void empty() {
        if (size == 0) {
            sb.append("1");
        } else {
            sb.append("0");
        }
        sb.append("\n");
    }

    private static void top() {
        if (size == 0) {
            sb.append("-1");
        } else {
            sb.append(stack.get(size - 1));
        }
        sb.append("\n");
    }
}
