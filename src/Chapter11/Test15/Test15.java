package Chapter11.Test15;

import net.mindview.util.Stack;

/**
 * @author:YiMing
 * @create:2020/8/6,15:44
 * @version:1.0
 */
public class Test15 {

    static Stack<Character> stack = new Stack<Character>();

    public void StackTest(String ll) {

        char[] chars = ll.toCharArray();

        for (int i = 0; i < chars.length; ) {
            switch (chars[i++]) {
                case '+':
                    stack.push(chars[i++]);
                    break;
                case '-':
                    System.out.print(stack.pop()+" ");
            }
        }
    }

    public static void main(String[] args) {
        Test15 test15 = new Test15();
        test15.StackTest("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }

}
