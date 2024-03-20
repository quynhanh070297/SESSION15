package Bai4;
import java.util.Scanner;
import java.util.Stack;
public class Bai4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("input string ");
        byte num = Byte.parseByte(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.print("input character " + (i + 1) + ": ");
            String word = scanner.nextLine();
            stack.push(word);
        }
        System.out.println("Reverse string:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}