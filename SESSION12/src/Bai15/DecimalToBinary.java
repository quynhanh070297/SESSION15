package Bai15;
import java.util.*;
public class DecimalToBinary
{
    public static void main(String args[])
    {
        // Cách chuyển từ hệ cơ số 10 sang hệ cơ số 2:
        // Ta lấy số đó chia 2 và lưu lại số dư, ta lấy thương chia tiếp cho 2 cho đến khi thương bằng 0.
        // Kết quả phép chuyển, ta lấy tất cả các số dư và ghi từ dưới lên
        // tao stack
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(" Moi ban nhap so thap phan: ");
        int num = 23;
        while(num>0)
        {
            int r = num%2;
            // đẩy phần còn lại vào stack
            stack.push(r);
            num/=2;
        }
        System.out.print(" Số nhị phân ");
        while (!(stack.isEmpty()))
        {
            // in số nhị phân kết quả được lưu
            // xếp chồng theo kiểu LIFO
            System.out.print(stack.pop());
        }

    }
}