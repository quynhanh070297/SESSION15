package Bai14;

import java.util.Scanner;
import java.util.Stack;

public class Prime
{
    public static void main (String[] args)
        {
            Stack<Integer> st = new Stack<>();
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int i = 2;

            while (num != 1)
            {
                if (num % i == 0)
                {
                    //  vut no vao stack
                    st.push(i);
                }
                // Update i
                i++;
            }
            // Print value of stack st
            while (!st.isEmpty())
            {
                System.out.println(st);
            }
        }
    }
