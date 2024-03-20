package Bai2;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackCheck
{
    static boolean checkStack (String ipst){
        Deque <Character> stack = new ArrayDeque<>();
        for (int i = 0; i < ipst.length(); i++)
        {
            char x = ipst.charAt(i);
            if (x=='('||x=='{'||x=='[')
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }
            char check;
            switch (x)
            {
                case ')' : check = stack.pop();
                if (check=='}'||check==']')
                {
                    return false;
                }
                break;
                case '}' : check = stack.pop();
                if (check== ')'||check==']')
                {
                    return false;
                }break;
                case ']' : check = stack.pop();
                    if (check == '}' || check== ')')
                    {
                        return false;
                    }
            }
        }
        return (stack.isEmpty());
    }
}
