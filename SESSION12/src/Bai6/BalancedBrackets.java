package Bai6;

import java.util.*;

    public class BalancedBrackets {

        // Hàm kiểm tra xem dau ngoặc có cân bằng không
        static boolean areBracketsBalanced(String expr)
        {
            // Su dung Deque
            Deque<Character> stack = new ArrayDeque<Character>();
            // Duyêt qua vong for
            for (int i = 0; i < expr.length(); i++) {
                char x = expr.charAt(i);

                if (x == '(' || x == '[' || x == '{') {
                    // Push x vao trong Stack
                    stack.push(x);
                    continue;
                }
                if (stack.isEmpty())
                    return false;
                char check;
                switch (x) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;
                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }

            // Kiem tra xem stack co rong hay khong
            return (stack.isEmpty());
        }

        // Driver code
        public static void main(String[] args)
        {
            String expr = "a*(skjfhask[fasjhfakjs{gsdgsd}hfghf])";

            // Function
            if (areBracketsBalanced(expr))
                System.out.println("Well");
            else
                System.out.println("????");
        }
    }

