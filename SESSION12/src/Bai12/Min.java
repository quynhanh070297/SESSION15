package Bai12;

import java.util.ArrayDeque;
import java.util.Queue;

public class Min
{
    public static void main(String[] args)
    {
        int[] array = {1,2,34,5,7,8,76};
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++)
        {
            queue.offer(array[i]);
        }
        System.out.println(queue);
        if(queue.poll()<queue.element());

    }
}
