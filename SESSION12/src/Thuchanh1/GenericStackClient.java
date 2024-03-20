package Thuchanh1;

public class GenericStackClient
{
    public static void main(String[] args)
    {
        System.out.println("1.Stack of integer");
        stackOfInteger();
        System.out.println("2.Stack of String");
        stackOfStrings();

    }
    private static void stackOfStrings()
    {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Kich thuoc cua Stack la: " + stack.size());
        System.out.println("Xoa mot phan tu ra khoi Stack");
        while (!stack.isEmpty())
        {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("Stack sau khi Xoa " + stack.size());

    }
    private static void stackOfInteger()
    {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Kich thuoc cua Stack la: " + stack.size());
        System.out.println("Xoa mot phan tu ra khoi Stack");
        while (!stack.isEmpty())
        {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("Stack sau khi Xoa " + stack.size());

    }
}
