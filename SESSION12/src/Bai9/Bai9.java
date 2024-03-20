package Bai9;

import java.util.Stack;

public class Bai9
{

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

       Stack stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Inserting arr[i] values to the stack
            stack.push(arr[i]);
        }

        // Reverse an array elements
        for (int i = 0; i < n; i++) {

            // Updating the arr[i] values
            arr[i] = (int) stack.pop();
        }
        System.out.println("\n"+ stack);



    }
}
