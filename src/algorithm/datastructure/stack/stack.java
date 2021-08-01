package algorithm.datastructure.stack;

import java.util.Stack;

/**
 * 栈（stack）
 * 先进后出
 */
public class stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("1");
        stack.add("2");
        stack.pop();
        stack.push("3");
        System.out.println(stack.toString());
    }
}
