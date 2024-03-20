package Bai1;

import java.util.LinkedList;
import java.util.Queue;

public class que
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();
        queue.add("Mot");
        queue.add("Hai");
        queue.add("Ba");
        queue.add("Bon");
        queue.add("Nam");
        System.out.println("Cac phan tu cua que la");
        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }


    }
}
